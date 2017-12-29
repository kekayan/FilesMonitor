package com.kekayan;

import com.kekayan.interfaces.Observer;

public class Main {

    public static void main(String[] args) {
        FilesMonitor filesmonitor = new FilesMonitor(); //subject

        Observer twitter = new TwitterObserver(); //observer1
        Observer sms = new SmsObserver(); //observer1
        Observer email = new EmailObserver(); //observer1

        filesmonitor.addObserver(twitter);
        filesmonitor.addObserver(sms);
        filesmonitor.addObserver(email);

        filesmonitor.monitorfiles();
    }
}
