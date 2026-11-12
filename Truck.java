public class Truck extends Vehicle {
    private int numberOfWheels;

    public Truck(String b, String m, int y, int numberOfWheels) {
        super(b, m, y);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void moveForward() {
        System.out.println("Truck moves forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Truck moves backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Truck moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Truck moves right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
