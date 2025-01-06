import java.security.spec.RSAOtherPrimeInfo;

public class App {
  public static void main(String[] args) {
    Child child = new Child();
  }
}

class Par {

//  private static int num;
//
//  static {
//    num = 10;
//    System.out.println("num = 10");
//  }

  public  Par() {
    System.out.println("Parent Cons");
  }
}

class Child  extends Par {
  public Child() {
    System.out.println("Child Cons");
  }
}

class A {
  public A() {
    System.out.println("This is cons of A");
  }
}

abstract class B  {
  public B() {
    System.out.println("This is cons of B");
  }
}

abstract class C  {
  public C() {
    System.out.println("This is cons of C");
  }
}

class D extends B {  // This is the diamond problem
  public D() {
    System.out.println("THis is cons of D");
  }
}


interface Alphabets {
  public void write();
}

interface Letters {

}

interface X extends Alphabets, Letters {
  public void display();
}

interface Y {
  public void listen();
}

class Z implements X,Y {

  public void display() {

  }

  public void write() {

  }

  public void listen() {

  }
}

