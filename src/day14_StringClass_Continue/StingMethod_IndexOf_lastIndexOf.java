package day14_StringClass_Continue;


public class StingMethod_IndexOf_lastIndexOf {
    public static void main(String[] args) {

        String str = "              EU batch    10 ";
        str = str.trim(); //"Eu Batch    10"

        System.out.println("str = " + str);

        String str1 = "Cydeo School";
        int n = str1.indexOf("h");
        System.out.println("n = " + n);

        int n1 = str1.indexOf("o"); // This "o" is the first one from the left.
        System.out.println("n1 = " + n1);

        int n2 = str1.indexOf("ool"); // in this case you happen to find the index number of "o" letter in "ool"
        System.out.println("n2 = " + n2);

        String str2 = "Java Programming Language";

        int n3 = str2.indexOf("ag"); // If I want to find the second "a" in word "Java " here what you have to do is space after a "a ".  in this case index number is 3;
        System.out.println("n3 = " + n3); // what if i want to find the index number of last "a"  here what I have to do is change the string value to "ag";

        // if I want to find the last "g" of index number I could use another method called: lastIndexOf();
        int n4 = str2.lastIndexOf("g");
        System.out.println("n4 = " + n4);

        System.out.println("______________________________________");

        String s = "Java Nova Canvas Havva Oranges";
        int firstA = s.indexOf("a"); // checks from left to right;
        int lastA = s.lastIndexOf("a");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("as "); another way to find the fourth a;
        int fourthA = s.indexOf("nva") +2;
        int secondO = s.lastIndexOf("O");

        System.out.println("first a index number is " + firstA);
        System.out.println("last a index number is " + lastA);
        System.out.println("third a index number is " + thirdA);
        System.out.println("fourth a index number is " + fourthA);
        System.out.println("secondO = " + secondO);



    }
}
