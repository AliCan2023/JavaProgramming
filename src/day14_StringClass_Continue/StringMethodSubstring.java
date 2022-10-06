package day14_StringClass_Continue;

public class StringMethodSubstring {

    public static void main(String[] args) {


        // in order to create sub-value we use : substring(beginning index, ending index); these two are the essential for this method;

        String word = "Cydeo Shool";
                //     01234......beginning index is 0 ending is 4;

        String Word= word.substring(0, 4 +1);

        System.out.println("Word = " + Word);

        String word1 = word.substring(6);// if you want the last part of the sentence you don't have to index the last letter;

        System.out.println("word1 = " + word1);

        String word2 = "Java Programming Language";

        String s1= word2.substring(0, word2.indexOf(" ")); // Java; without counting the index number we use indexOf()method as well;
        String s2=word2.substring(word2.indexOf(" ")+1, (word2.lastIndexOf(" ")));// Programming;this word starts P and it is right after the first Spcae that's why we put +1;
           // the second word ending is right before tha last space we used lastIndexOf() method;
        String s3= word2.substring(word2.lastIndexOf(" ")+1);// Language
        // to get the last block of the String value it starts right after the last space and we used lastIndexOf() +1 method
        // we don't have to find the index number of the ending of last block;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);











    }



}
