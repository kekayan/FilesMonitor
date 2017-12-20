package com.kekayan;

import com.kekayan.observer.Observer;

public class ObserverClient implements Observer {

    @Override
    public void notifyMe(int filescount) {
        System.out.println("current files : "+filescount);
    }
}
