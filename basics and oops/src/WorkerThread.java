public class WorkerThread implements Runnable {
  private String message;

  public WorkerThread(String message) {
    this.message = message;
  }

  public void run() {
    System.out.println(Thread.currentThread().getName() + " Start with message " + message + "\n");
  }
}
