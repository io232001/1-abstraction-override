package it.develhope.abstraction;
class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;
    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }
    @Override
    public void doVehicleSound() {
        System.out.println("Splash splash!");
    }
    public String getBoatWeightAndSpeed() {
        return "This boat weighs " + boatKilosWeight + " kg and has a maximum speed of " + maxKnotsSpeed;
    }
}
