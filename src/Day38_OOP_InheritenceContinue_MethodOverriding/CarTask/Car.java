package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles;


    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting");

    }

     void drive() {
        System.out.println(brand + " " + model + " is driving");

    }

    /* public void fly(){
//  fly(): is not common for all the cars, and parent class should contain the common feature of child classes;
    }

     */

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
/*
carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following subclasses of Car:
			1. Toyota:
					extra methods:
							reliable()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();

 */