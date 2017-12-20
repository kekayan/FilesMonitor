package com.kekayan;

public class Main {

    public static void main(String[] args) {
	    FilesMonitor filesmonitor=new FilesMonitor();
	    ObserverClient kekayan=new ObserverClient();
	    filesmonitor.addObserver(kekayan);
        filesmonitor.monitorfiles();
    }
}
