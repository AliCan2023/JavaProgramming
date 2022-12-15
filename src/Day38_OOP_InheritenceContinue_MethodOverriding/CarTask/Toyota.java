package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class Toyota extends  Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable.");
    }
    public void start(){//if the parent class instance method access modifier is public the overridden method should be public;
        // obey the strict rules;
        System.out.println("Twist the key to ignition to start " + brand + " " + model);


    }
    protected void drive(){// the overridden method access modifier is the same or more visible;
        // Access Modifier Visibility comparison:public>protected>default>private;

    }
}
