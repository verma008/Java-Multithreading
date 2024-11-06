"# Java-Multithreading" 

-> WHAT IS MULTITHREADING
    Multithreading in java is a process of executing multiple threads simultaneously withinn a single program. It enables better resource utilization and improved performance for applications, especially those that            perform many tasks independently. Every Java program has at least one thread, called main thread, which starts when the program begins. A thread is a light weight sub-process, smallest unit of processing.

-> WAYS TO CREATE THREADS There are two ways to create threads in java:
    By implementing Runnable Interface: This is the prefferd approach because it provides more flexibility. Implement Runnable Interface in a class and pass it to a Thread object.
    By extending Thread class: This is Simple but less flexible due to single inheritance limitation. We create a class that extends Thread and override the run() method.
    
-> THREAD LIFECYCLE 
    New → Runnable → Running → Blocked/Waiting → Terminated

-> DAEMON THREAD
    Daemon thread in java is a service provider that provides services to the user thread. In java Garbage Collector is the best example of Daemon thread.
