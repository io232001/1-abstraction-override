package it.develhope.abstraction;
class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;
    public Car(int wheels, int doors, double price)
    {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
    @Override
    public void showVehicleDetails()
    {
        super.showVehicleDetails();
        System.out.println("This car has " + numberOfDoors + " doors.");
    }
    @Override
    public void doVehicleSound()
    {
        System.out.println("Vroom Vroom!");
    }
}