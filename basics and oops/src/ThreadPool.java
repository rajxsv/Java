import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
  public static void main(String args[]) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    for (int i=0; i<10; i++) {
      WorkerThread workerThread = new WorkerThread(Integer.toString(i));
      executorService.execute(workerThread);
    }
    System.out.println("isTerminated = " + executorService.isTerminated());
    while (executorService.isTerminated()) {
      System.out.println("Done with thread pool demo");
    }
  }
}
