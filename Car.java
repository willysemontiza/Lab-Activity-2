public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String b, String m, int y, int doors) {
        super(b, m, y);
        this.numberOfDoors = doors;
    }

    @Override
    public void moveForward() {
        System.out.println("Car moves forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car moves backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Car moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Car moves right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}