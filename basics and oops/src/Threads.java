public class Threads {
  public static void main(String args[]) {
    for (int i=0; i<10; i++) {
      myThread t1 = new myThread();
      t1.start();
    }
  }
}

class myThread extends Thread {
  @Override
  public void run() {
    for (int i=0; i<5; i++) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
