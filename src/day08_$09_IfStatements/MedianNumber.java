package day08_$09_IfStatements;

public class MedianNumber {   // the number in the middle;

    public static void main(String[] args) {

        int a = 10,
                b = 20,
                c = 30;
        //           a = 20 b = 10 c = 30       a= 20 b= 30 c = 10
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
       /*
           in order to get a is the median number:
           1. if c is the maximum number & b is the minimum number, then a is the median number
           2.if b is the maximum number & c is the minimum number, then a is the median number
        */

        //          a = 30   b = 20 c = 10      a = 10 b = 20 c= 30
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        //
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is median number.");
        }
        if (bIsMedian) {
            System.out.println(b + " is median number. ");
        }
        if (cIsMedian) {
            System.out.println(c + " is median number. ");
        }
        System.out.println("______________________");

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(" a is the median number.");
        }
        if ((b > c && b < a) || (b > a && b < c)) {
            System.out.println(" b is the median number.");
        }
        if ((c > a && c < b) || (c > b && c < a))
            System.out.println("c is the median number.");

    }
}
/*
Ex;
a = 10, b= 15, c = 20;
output;
15 is the median number

3 possibilities
   1. a could be median number.
   2. b could be....
   3. c could be ......
 */