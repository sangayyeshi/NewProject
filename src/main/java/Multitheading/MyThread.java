package Multitheading;

public class MyThread  extends Thread{
    public void run(){
        System.out.println("This code is running in a thread");
    }

    static  void main(){
        // create the object of the mytheard
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("This code is outside of the thread (main thread)");

    }
}
