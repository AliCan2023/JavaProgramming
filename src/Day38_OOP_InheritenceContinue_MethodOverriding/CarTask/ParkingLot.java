package Day38_OOP_InheritenceContinue_MethodOverriding.CarTask;

public class ParkingLot {
    public static void main(String[] args) {  // ParkingLot class HAS A Relation with Toyota;

        Toyota toyota = new Toyota("Hybrid",2020,35000,"Silver",20000);

        Tesla tesla = new Tesla("Full Autonom",2023,45000,"black",0);

        BMW bmw = new BMW("i4",2016,20000, "BLue",20000);

toyota.start();
tesla.start();
bmw.start();




    }
}
