package com.kekayan;

import com.kekayan.interfaces.Observer;
import com.kekayan.interfaces.Subject;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class FilesMonitor implements Subject {
    private ArrayList<Observer> observers;
    private int filescount;
    private String Path;
    public FilesMonitor(String path) {
        observers = new ArrayList<>();
        filescount=count(path);
        Path=path;

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
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notifyMe(filescount);
        }
    }

    public void monitorfiles(){

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

               int fileslength=count(Path);
                //if need to notify for each 10sec even no new changes remove the if
                if (filescount != fileslength) {
                    filescount=fileslength;
                    notifyAllObservers();
                }
            }
        }, 0, 10000);


    }

    public int count(String path){
        String folderPath=path;
        File dir=new File(folderPath);
        String[] files=dir.list();
        return  files.length;
    }

}
