package com.kekayan;

import com.kekayan.interfaces.Observer;

public class SmsObserver implements Observer {
    @Override
    public void notifyMe(int filescount) {
        System.out.println("current files : " + filescount + " sending Email....");
    }
}
