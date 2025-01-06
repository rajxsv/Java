//public class MethodOverriding {
//
//  public static void main(String[] args) {
//      B b = new B();
//      C c = new C();
//
//      b.fn();
//      c.superFn();
//  }
//}
//
//class A {
//  A() {
//    System.out.println("Class A instanciated");
//  }
//
//  public void fn() {
//    System.out.println("fn() of A");
//  }
//
//  public final void foo() {
//    System.out.println("This is foo");
//  }
//
//}
//
//class B extends A {
//  B() {
//    System.out.println("Class B instanciated");
//  }
//  public void fn() {
//    System.out.println("fn() of B");
//  }
//
//
//  // well i cant override final vars
////  @Override
////  public void foo() {
////    System.out.println("Foo from B");
////  }
//
//}
//
//class C extends A {
//  C() {
//    System.out.println("Class C instanciated");
//  }
//
//  public void fn() {
//    System.out.println("fn() of C");
//  }
//
//  public void superFn() {
//    super.fn();
//  }
//}
