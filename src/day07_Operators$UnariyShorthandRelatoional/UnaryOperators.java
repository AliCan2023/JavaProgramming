package day07_Operators$UnariyShorthandRelatoional;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25; // + is  optional;
        int num2 = -25; // - is required;

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true

        System.out.println("---------------------");

        int a = 5; // ++a is pre increment: increase the value by 1;
        ++a;
        System.out.println(a);

        --a; // pre decrement : decrease the value by 1;
        System.out.println(a);

        System.out.println("---------------------");

        int b = 100;
        System.out.println(++b);  // this is pre increment;

        int c = 100;
        System.out.println(c++);// this is post increment: it passes the current value after that increases the value by 1
        System.out.println(c); // 101

        System.out.println("---------------------");

        int d = 220;
        System.out.println(--d); // pre decrement
        int x = 220;
        System.out.println(x--); // post decrement
        System.out.println(x);

        System.out.println("---------------------");

        int a1=25;
        System.out.println(++a1);   // 26
        System.out.println(--a1);   // 25

        System.out.println("---------------------");
        int b1 = 100;

        System.out.println(b1++);  // 100
        // it displays 100 but right after that b1 increase by 1 and makes 101
        System.out.println( b1--);  // 101 the first value of b1 displays 101 and next value is decreased by 1 becomes 100

        System.out.println("---------------------");

        int z = 45;

        System.out.println(++z);// 46 , z=46
        System.out.println(z++); // 46 , z= 46
        System.out.println(z);  //47

        System.out.println("---------------------");

        int f = 30;
        System.out.println(--f); // 29, f = 29
        System.out.println(f--); //29 ,f= 28
        System.out.println(f);  // 28



    }
}
