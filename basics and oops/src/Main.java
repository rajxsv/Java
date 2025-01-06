import java.lang.reflect.Constructor;
import java.util.Calendar;

public class Main {

    private static int fn() {
        return 100;
    }

    private static class Cls {
        public final int num = 10;

        private static class InnerCls {
            public void fn() {
                System.out.println("Inner Class of inner class");
            }
        }

        public void fn() {
            System.out.println(num);
        }
    }
    // if we dont make this static, main becomes non static this means to call main we need to make object of Main to call main
    // but the starting point of the application is the main method ! so its like a deadlock
    // so we make this static now we are good
    public static void main(String[] args) throws ClassNotFoundException {   // now
        System.out.println("this is args " + args);
        System.out.println("Hello World");
        // ? System is a built-in Java class that contains useful members, such as out, which is short for "output". The println() method, short for "print line", is used to print a value to the screen (or a file).

        int num = 1;
        System.out.println(num);

        float numf = 10f/3f;
        System.out.println(numf);

        char ch = (char)(num+'a');
        System.out.println(ch);

        String s1 = "RAOISFAEIF";
        String s2 = "a good boy ";
        System.out.println(s1+s2+s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        System.out.println("index of F = " + s1.indexOf("F"));
        System.out.println((int)(Math.random()*12));
        System.out.println(1>2); // c++ would have printed 0!

        int[][] arr={{1, 2}};
        System.out.println(arr[0][0]);

        Cls cls = new Cls();
        cls.fn();

        Cls.InnerCls clsi = new Cls.InnerCls();
        clsi.fn();

        Calendar c = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());

        int a = 500;
        Byte b = (byte) a;

        System.out.println(b);

        float f = 1.7f;

        Class.forName("Calculator"); // loading class explicitly using Class Class
        System.out.println("user " + Calculator.user);  // loading the class even before initialising it !

        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,4));

        int nums[] = {1,2,3,4,5,5,6};
        System.out.println(nums[0]);

        for(Object n : nums) {
            System.out.println(n);
        }

        Casio cs = new Casio();
        cs.fn();

        String str1 = "Raj";
        String str2 = "Raj";


//      str1 == str2 checks if str1 and str2 reference the same memory location
//      (i.e., they are the exact same object).
//      str1.equals(str2) checks if the values of str1 and str2 are the same,
//      regardless of whether they are different objects.
//      String Constant Pool in the jvm, makes sure no copies are generated

        System.out.println(str1.equals(str2));

        StringBuilder sb = new StringBuilder("Rajpreet");
        System.out.println(sb);
        System.out.println(sb.capacity()); // buffer is to reduce the relocation of the string

        sb.deleteCharAt(2);
        sb.deleteCharAt(2);
        sb.deleteCharAt(2);
        System.out.println(sb); // another absoervation if i start deleting characters, it does not reduce the capacity
        System.out.println(sb.capacity()); // buffer is to reduce the relocation of the string

        // String Buffer (thread safe) and String Builder

        Calculator cn = new Calculator(); // se this time the static part of calculator did not get called
        cn.sum(2,3);
        System.out.println(Calculator.user);

        // Now here comes the concept of class loader and static variables of class instances ,
        // the class when it is loaded (1st time Calculator was initiated) then at that time the static
        // block is called but after that nope. every instance you create the static block is not called !

    }


//        /Users/rajpreetsingh/Documents/Code/Java/basics and oops/src/Main.java:76:20
//        java: non-static variable this cannot be referenced from a static context
//    class Calculator {
//       public Calculator() {
//           System.out.println("Calculator cons");
//       }
//
//        public int sum(int a, int b) {
//            return a + b;
//        }
//    }
//
//    class Casio extends Calculator {
//        public Casio() {
//            System.out.println("Casio cons");
//        }
//
//        public void fn() {
//            System.out.println("I am casio");
//        }
//    }
}

//class Calculator {
//
//    static String user = "Rajpreet";
//
//    public Calculator() {
//        System.out.println("Calculator cons");
//    }
//
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

class Calculator {

    static String user;

    static {
        user = "Rajpreet";
        System.out.println("Static block of Calculator got called");
    }

    public Calculator() {
        System.out.println("Calculator cons");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}

class Casio extends Calculator {


    public Casio() {
        System.out.println("Casio cons");
    }

    public void fn() {
        System.out.println("I am casio");
    }
}


