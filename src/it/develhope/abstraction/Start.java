package it.develhope.abstraction;
public class Start
{
    public static void main(String[] args)
    {
        Car myCar = new Car(4, 2, 25000.0);
        Boat myBoat = new Boat(50.0, 5000);
        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();
        System.out.println(myBoat.getBoatWeightAndSpeed());
    }
}
