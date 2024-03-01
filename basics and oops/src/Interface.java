import java.lang.instrument.Instrumentation;

public class Interface {
  private static Instrumentation instrumentation;
  public static void main(String args[]) {
    Chicken c = new Chicken();
    System.out.println(c.ears());
    Name n = Name.Anmol;
    System.out.println(n);
    System.out.println(instrumentation.getObjectSize(n));
  }
}

enum Name {
  Anmol,
  Raj,
  Navdeep
}

interface Animal {
//  String animal="";  // since we cant change we dont put it should be there as const
  public int legs();
  public int ears();
  public int eyes();
}

interface Protect_Animal {
//  public abstract int protect_id();
  public int protect_id();
}

class Chicken implements Animal,Protect_Animal {
//  Chicken() {
//    this.animal="Chickden"; // inteface does not allow this changing whatever was declared in interface is final
//  }
  @Override
  public int ears() {
    return 2;
  }

  @Override
  public int eyes() {
    return 2;
  }

  @Override
  public int legs() {
    return 2;
  }

  @Override
  public int protect_id() {
    return 52;
  }
}

abstract class Animal2 {
  String animal="";
  public abstract int legs();
  public abstract int ears();
  public abstract int eyes();
}
//class Chicken2 extends Animal2,Protect_Animal {  // not possible
class Chicken2 extends Animal2 {
  Chicken2() {
    this.animal="Chickden";
  }
  @Override
  public int ears() {
    return 2;
  }

  @Override
  public int eyes() {
    return 2;
  }

  @Override
  public int legs() {
    return 2;
  }
}
