package rd.threads;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.*;

public class MainPatientQueue {

    public static void main(String[] args) {

        final BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();

        PatientQueue patientQueue = new PatientQueue(blockingQueue);

        new Thread(patientQueue).start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Doctor(blockingQueue));
        executorService.submit(new Doctor(blockingQueue));
        // dodoanie doktorow rozladowuje kolejke
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
//    executorService.submit(new Doctor(blockingQueue));
    }
}

class PatientQueue implements Runnable {

    private final BlockingQueue<String> queue;

    private int number = 1;

    public PatientQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("New patient");
        while (true) {
            try {
                Thread.sleep(100);
                queue.offer(Thread.currentThread().getName() + " patient " + (number++), 1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Doctor implements Runnable {

    private final BlockingQueue<String> queue;

    public Doctor(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName() + " Getting patient " + queue.poll(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("In queue " + queue.size());
            try {
                Thread.sleep(RandomUtils.nextInt(300, 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
