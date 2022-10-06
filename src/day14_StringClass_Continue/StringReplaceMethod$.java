package day14_StringClass_Continue;

public class StringReplaceMethod$ {

    public static void main(String[] args) {


        String str = " Java is fun, I love learning Java .";
        String newStr = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("newStr = " + newStr);

        String email = "JohnTrevolta@hotmail.com";
        email = email.replace("hotmail", "gmail");
        //String newEmail= email.replace("hotmail", "gmail");

        System.out.println("email = " + email);
        //System.out.println("new E-mail = " + newEmail);

        System.out.println("--------------------------");

        String sentence = "Java Java Python Python C# C++ Python Python Python 1";
        String newSentence = sentence.replace("Python", ""); //Java Java   C# C++    1"
        newSentence=newSentence.replace("   ", " ").replace("  ", " ");

        System.out.println("newSentence = " + newSentence);
        

        String animal = "Dog Dog Dog Donkey Dog";
        animal=animal.replace("Dog","Cat");
        System.out.println("animal = " + animal);
        
        String school = "Cydeo School";
        school = school.replace("o", "u"); // Cydeu Schuul;

        System.out.println("school = " + school);

        System.out.println("--------------------");
        // replaceFirst(); method
        
        String conclusion = "Java Java Java";
        //conclusion= conclusion.replace("Java", "C++");// "C++ C++ C++"
        conclusion= conclusion.replaceFirst("Java", "Python");

        System.out.println("conclusion = " + conclusion);
        
        String result = " C# is fun, C# is cool!";
        result= result.replaceFirst("C#", "Java");

        System.out.println("result = " + result);
        // replace first letter ;

        String result1 = "Java";
       // result1=result1.replaceFirst("a", "o"); how about replace last a ?!
        result1 = result1.replaceFirst("va", "vo");

        System.out.println("result1 = " + result1);
        
        






    }
}
