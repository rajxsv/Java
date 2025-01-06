import java.util.Date;


class Fan {
  public static void start() {
    System.out.println("Fan Started");
  }
};

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");  
    // ? System is a built-in Java class that contains useful members, such as out, which is short for "output". The println() method, short for "print line", is used to print a value to the screen (or a file).
    int num = 1;
    System.out.println(num);

    float numf = 10f/3f;
    System.out.println(numf);

    char ch = (char)(num+'a');
    System.out.println(ch);

    String s1 = "Rajpreet is ";
    String s2 = "a good boy";
    System.out.println(s1+s2+s1.length());

    Date date = new Date();
    System.out.println(date);

    byte b = (byte)153;
    System.out.println(b);

    Fan.start();

  }
}





// 