package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class Tesla extends Car {


    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has autopilot function.");
    }
}
