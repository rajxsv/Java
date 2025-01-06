abstract class Employee {
  int data = 10;
  abstract void run();
  void walk() {
    System.out.println("Walking");
  }
}

class Engineer extends Employee{
  @Override
  void run() {
    System.out.println("Running");
  }
}

interface humanResources {
  int data = 19;  // public static final
  void reject();
}

class Jimmy implements humanResources {
  @Override
  public void reject() {
    System.out.println("Sorry to inform you we are deciding to continue with other aplicants");
  }
}

public class Abstract {
  public static void main(String args[]) {
    Engineer eng = new Engineer();
    eng.run();
  }
}

