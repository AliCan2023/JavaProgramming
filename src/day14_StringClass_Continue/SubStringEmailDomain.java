package day14_StringClass_Continue;

public class SubStringEmailDomain {

    public static void main(String[] args) {

        String email = "Cydeo.school@gmail.com";// I tried in two different ways;

        //String emailDomain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));// This is the simplest one;

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String emailDomain = email.substring(beginningIndex, endingIndex);

        // universal solution is to find domain is right after @ that's why +1; we need the last "." so we used lastIndex();

        System.out.println("The E-mail Domain is " + emailDomain);

        System.out.println("________________________");

        String str1 = "Java is fun, Java is cool"; // what if I have more words in my string?!

        //
        String s1 = str1.substring(0, 10 + 1); // Java is fun " extract this part;

        int begIndex = str1.lastIndexOf("J");
        String s2 = str1.substring(begIndex);//assigned the value to Sting s2;


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("*******************");

        String motto = "Java is fun, Java is cool and I love Java";// what if I want to extract:"Java is cool" part?!
        int startIndex = motto.indexOf(" J") + 1;
        int endIndex = motto.lastIndexOf(" a");
        String motto1 = motto.substring(startIndex, endIndex);

        String s3 = motto.substring(motto.lastIndexOf("I"));

        System.out.println("My motto is " + motto1);
        System.out.println("Last block of Motto is " + s3);



    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */