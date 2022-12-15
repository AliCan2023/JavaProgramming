package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing in Dubai.");
    }
    public void breakdown (){
        System.out.println(brand + " " + model + " breaks down every 100 miles.");
    }

    @Override
    public void start() {
        //super.start();
        System.out.println("Call the mechanic to jump start " + " " + brand + model);
    }
}
