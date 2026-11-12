public class Motorcycle extends Vehicle {
    private String engineType;

    public Motorcycle(String b, String m, int y, String e) {
        super(b, m, y);
        this.engineType = e;
    }

    @Override
    public void moveForward() {
        System.out.println("Motorcycle moves forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Motorcycle moves backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Motorcycle moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Motorcycle moves right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineType);
    }
}