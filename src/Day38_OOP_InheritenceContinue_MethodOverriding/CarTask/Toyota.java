package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class Toyota extends  Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable.");
    }
}
