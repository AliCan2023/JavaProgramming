package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class Tesla extends Car {



    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has autopilot function.");
    }


    void drive() {
        super.drive();
    }

    @Override
    public void start() {
        //super.start();// delete the default implementation
        System.out.println("Say \"start\" to start " + brand +" " + model);
    }
}
