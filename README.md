# FilesMonitor
An example for Observer Pattern for My Software Architecture & Desgin Assingmnent.
The Apllication will monitor a particular Folder and notify the file counts to the subscribers.

Inorder to change the listening directory.we need to pass the directory to constructor
```java
FilesMonitor filesmonitor = new FilesMonitor("E:/Test"); //subject
```


Since i used dummy implementations for Sms, Email and Twitter message sending classes.
Output will be like below .
When we run our application.whenever change happen it ll notify



