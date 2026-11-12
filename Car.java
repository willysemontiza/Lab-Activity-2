public class Car extends Vehicle implements Serviceable {

    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Age: " + calculateAge());
        System.out.println("Vintage: " + isVintage());
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void service() {
        System.out.println("Car: Check the Oil and the Brakes.");
    }
}