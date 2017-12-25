package com.kekayan;

import com.kekayan.interfaces.Observer;

public class EmailObserver implements Observer {
    @Override
    public void notifyMe(int filescount) {
        System.out.println("current files : " + filescount + " sending SMS....");
    }
}
