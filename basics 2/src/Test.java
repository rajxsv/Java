public class Test {
  public void notMain(){
    System.out.println("Not Main !");
  }
}

class WhoAmI{
  public static void main(String args[]) {
    Test t = new Test();
    t.notMain();
  }
}
