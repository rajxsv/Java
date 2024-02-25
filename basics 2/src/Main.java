public class Main {
    static int fn() {
        return 100;
    }
    public static void main(String[] args) {
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



    }
}





// 