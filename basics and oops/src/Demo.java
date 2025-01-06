abstract class Demo //abstract class
{
  //abstract method declaration
  abstract void display();
  void walk() {
    System.out.println("Walking");
  }
}

interface demo2 {
  void display();
}

class OOPSS {
  int data;
  String Name;

  OOPSS() {
    System.out.println("Thanks for using me");
  }

  public void setData(int d) {
    this.data = d;

    this.Name = String.valueOf(d);
  }

  public void This() {
    System.out.println(this.data + "----" + this.Name);
  }
}

class alsoMyClass implements demo2 {

  @Override
  public void display() {
    System.out.println("Display it !");
  }
}

class MyClass extends Demo {
  void display() {
    System.out.println("Abstract method?");
  }

  // now walk becomes optional

  public static void main(String args[]) {
    Demo obj = new MyClass();
    obj.display();

    OOPSS o = new OOPSS();
    o.setData(2);
    o.This();
  }
}