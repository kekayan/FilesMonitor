package com.kekayan;

import com.kekayan.observer.Observer;
import com.kekayan.observer.Subject;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class FilesMonitor implements Subject {
    private ArrayList<Observer> observers;
    private int filescount;

    public FilesMonitor() {
        observers = new ArrayList<>();
        filescount=0;

    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notifyMe(filescount);
        }
    }

    public void monitorfiles(){

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                String folderPath="E:/Test";
                File dir=new File(folderPath);
                String[] files=dir.list();
                if (files != null) {
                    filescount=files.length;
                    notifyObservers();
                }
                else
                {
                    //todo null
                }
            }
        }, 0, 10000);


    }


}