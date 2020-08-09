package rd.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class MainBasic {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " runing main program");
        MyThread myThread = new MyThread();
        myThread.start();

        Thread myRunnable = new Thread(new MyJob());
        myRunnable.start();

        System.out.println("the end");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " !!!! do something " + getClass());
    }
}

class MyJob implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " !!!! do something " + getClass());
    }
}

class MyJobWIthResult implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " !!!! do something " + getClass());
        return "done";
    }
}
