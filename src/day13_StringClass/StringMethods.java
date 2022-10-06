package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Alibaba";
        //index : 0123456

        char fourthChar = word.charAt(4);

        System.out.println("Fourth Character = " + fourthChar);

        char tenthChar = word.charAt(6); // String index is out of range the index limit is 7;

        System.out.println("Tenth Character = " + tenthChar);

        System.out.println("____________________________");


        String s1 = " EU Batch  10 is the best batch."; // even the space counted as a character...
        int totalChar = s1.length();

        System.out.println("Total Character = " + totalChar);
        char lastChar = s1.charAt(s1.length() - 1);  // you always get the last index number;

        System.out.println("Last Character = " + lastChar);

        System.out.println("___________________");

        String str = " Sesame ,open the door!";
        str = str.toUpperCase();
        /*one variable can only contain one data; so it gives me the same case letter in the string;
        if you don't assign it back it always gives you the old value of the variable .
        in order to  see the toUpperCase() works out in this case we have to assign the value back as mentioned above.
         */
        System.out.println("str = " + str);

        // Let's do one more time. " The weather is clear and warm today."

        String howIsItLike = "The weather is clear and warm today.";
        howIsItLike = howIsItLike.toUpperCase(); // clearly can be  seen that after the value assigning back to the Variable we can see the change;

        System.out.println("How it is like = " + howIsItLike);


    }
}
