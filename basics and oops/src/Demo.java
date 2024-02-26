abstract class Demo //abstract class
{
  //abstract method declaration
  abstract void display();

}
class OOPS {
  int data;
  String Name;
  OOPS(){
    System.out.println("Thanks for using me");
  }
  public void setData(int d){
    this.data=d;
    this.Name=String.valueOf(d);
  }
  public void This(){
    System.out.println(this.data+"----"+this.Name);
  }
}
class MyClass extends Demo
{
  //method impelmentation
  void display() {
    System.out.println("Abstract method?");
  }
  public static void main(String args[])
  {
    Demo obj = new MyClass();
    obj.display();

    OOPS o = new OOPS();
    o.setData(2);
    o.This();
  }
}