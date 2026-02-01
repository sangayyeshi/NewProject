package Multitheading;

public class MyRunnable  implements Runnable{

    public void run() {
        System.out.println("This code is running in a thread");
    }
    static  void main(){
        MyRunnable myRunnable = new MyRunnable();
       Thread thread = new Thread(myRunnable);
       thread.start();
        System.out.println("This code is outside of the thread (main thread)");
    }
}
