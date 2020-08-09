package rd.threads;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class MainSynchronized {

  private static Counter counter = new Counter();

  public static void main(String[] args) throws InterruptedException {
    // ekwiwalent do utworzenia klasy i implementacji interfejsu Runnable
    // patrz MainBasic klasa MyJob

    ExecutorService service = Executors.newFixedThreadPool(20);

    // bez synchronized blednie inkrementuje licznik
    // z synchronized dziala prawidlowo
    IntStream.range(0, 1000)
        .forEach(count -> service.submit(() -> counter.calculate()));
    service.awaitTermination(1000, TimeUnit.MILLISECONDS);

    service.shutdown();
  }
}

class Counter {

  private Integer counter = 0;

  public void calculate() {
    System.out.println("calculate " + getCounter());
    setCounter(getCounter() + 1);
  }

  public synchronized void calculateSynchronized() {
    System.out.println("calculate " + getCounter());
    setCounter(getCounter() + 1);
  }

  public Integer getCounter() {
    return counter;
  }

  public void setCounter(Integer counter) {
    this.counter = counter;
  }

  @Override
  public String toString() {
    return "Counter{" +
        "counter=" + counter +
        '}';
  }
}
