public class Singleton {
  public static void main(String args[]) {
//    Singleton s = new Singleton(); // not valid
    Singleton_Example s = Singleton_Example.getSingleton();
    System.out.println(s);
    Singleton_Example s2 = Singleton_Example.getSingleton();
    System.out.println(s);
  }
}
class Singleton_Example {
  public int data;
  private static Singleton_Example s;
  private Singleton_Example(int d) {
    this.data=d;
  }
  public static Singleton_Example getSingleton(){
    if(s==null){
      s=new Singleton_Example(0);
    }
    return s;
  }
}
