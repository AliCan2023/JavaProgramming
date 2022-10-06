package day15_ForLoops$ReviewOfString;

public class StringMethodIsEmpty {

    public static void main(String[] args) {

        String str = " ";

        boolean tf = str.isEmpty(); //isEmpty() method;

        System.out.println(tf);
        System.out.println("______________");

        String st = "";
        boolean ft = st.isBlank();// isBlank() method is giving true as long as String variable contains nothing or white spaces;

        String st1 = "cdyeo";
        boolean ft1 = st1.isBlank();

        System.out.println(ft);
        System.out.println("ft1 = " + ft1);

        System.out.println("____________");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        System.out.println("************************");

        String stnce = " My favorite food is polo";
        boolean hasPolo = stnce.contains("Polo");//false ; koz this method is case sensitive;
        boolean hasPolo1 = stnce.toUpperCase().contains("POLO");
        System.out.println(hasPolo);
        System.out.println(hasPolo1);
        System.out.println("-----------------------------");

        String input = "I love Java";
        String input1 = "Java";

        System.out.println(input.contains(input1));
        System.out.println("________________________________");
        String a = "Silver Spoon";

        boolean x = a.startsWith("Silver");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("silver");
        // first call the lowercase or uppercase() method then call the startsWith or ednsWith method;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





    }
}
