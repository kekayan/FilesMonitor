package com.kekayan;

public class Main {

    public static void main(String[] args) {
        FilesMonitor filesmonitor = new FilesMonitor(); //subject
        TwitterObserver twitter = new TwitterObserver(); //observer1
        SmsObserver sms = new SmsObserver(); //observer1
        EmailObserver email = new EmailObserver(); //observer1
        filesmonitor.addObserver(twitter);
        filesmonitor.addObserver(sms);
        filesmonitor.addObserver(email);
        filesmonitor.monitorfiles();
    }
}
