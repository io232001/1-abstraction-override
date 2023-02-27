package it.develhope.abstraction;
public abstract class Vehicle {
    private String type;
    private int numberOfWheels;
    public Vehicle(String type, int numberOfWheels)
    {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }
    public void showVehicleDetails()
    {
        System.out.println("This is a " + type + " with " + numberOfWheels + " wheels.");
    }
    public abstract void doVehicleSound();
}

