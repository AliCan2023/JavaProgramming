package Day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();  // Ali Can Bugraoglu

        System.out.println("Enter your building number: ");  // 333ACB
        String buildingNumber = scan.next(); // used the other methods before nextLine method here so need to empty the scanner memory
        scan.nextLine();
        System.out.println("Enter your street name: "); //4304.Cad
        String strName = scan.nextLine();

        System.out.println("Enter your city name:");// Ankara
        String CityName = scan.nextLine();

        System.out.println("Enter your state: ");// Miami
        String State = scan.nextLine();

        System.out.println("Enter your zip Code:"); // 69609
        int zCode = scan.nextInt();// Used the other methods before nextLine method here so need to empty the scanner memory
        scan.nextLine();
        System.out.println("Enter your country name : "); // Turkiye
        String cName = scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("strName = " + strName);
        System.out.println("CityName = " + CityName);
        System.out.println("State = " + State);
        System.out.println("zCode = " + zCode);
        System.out.println("cName = " + cName);
        System.out.println(fullName + "\n" + buildingNumber + " " + strName + "\n"
                + CityName + ", " + State + " " + zCode + "\n" + cName);
        scan.close();

    }
}
/*
Enter your full name (nextLine())
Enter your building number(next()) // Need additional nextLine() method to empty the leftover Enter from the previous method(NotnextLineMethods)
Enter your street name(nextLine())
Enter your city name(nextLine())
Enter your state(next())
Enter your zip code(next())
Enter your country name (nextLine())

Display the shipping address

 */