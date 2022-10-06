package day07_Operators$UnariyShorthandRelatoional;

public class ShortHandOperators {
    public static void main(String[] args) {

        // assignment: =

        int number = 100;

        System.out.println("number = " + number); //

        number = 200;

        System.out.println("number = " + number); //200
        System.out.println("------------------------");
        String Word = " Java Programming";

        System.out.println("Word = " + Word);

        Word = "Silver Spoon";

        System.out.println("Word = " + Word);


        Word = "Cydeo";
        System.out.println("Word = " + Word);

        Word = "123" + 1;
        System.out.println("Word = " + Word);

        Word = "Java Programming";
        System.out.println("Word = " + Word);

        System.out.println("************************");

        // Addition Assignment: +=

        int x = 100;

        System.out.println("x = " + x);

        // x = x + 200;
        x += 300;
        System.out.println("x = " + x); // 400

        String str = "wooden";
        str += "spoon";
        System.out.println("str = " + str); // woodenspoon

        double num1 = 2.5; // 2.5

        num1 += 1.5;

        System.out.println("num1 = " + num1); // num1 = 4.0

        double availableBalance = 1000.50;
        // availableBalance = 500; // deposit another 500$ gives me only 500$
        availableBalance += 500;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println(" ************************* ");
// Subtract Assignment operator: -=
        // withdrawal of 400$
        double availableBalance1 = 1000.50;
        availableBalance1 -= 300;

        System.out.println("availableBalance1 = " + availableBalance1);
        // withdrawing 200$ then depositing 400$
        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);

        // Multiplication Assignment

        double salary = 18000;
        salary *= 2;
        System.out.println("salary = " + salary);

        double num2 = 500;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------");
        double num = 100;

        // remainder assignment %=

        num %= 3;
        System.out.println("num = " + num);

        int amount = 127; // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("*******************");
        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);


        int y = 300;
        y %= 16;
        System.out.println("y = " + y);
        System.out.println("---------------");

        int balance = 3000;
        // insurance fee: 153$
        balance %= 153;
        System.out.println("balance = " + balance);

    }
}
