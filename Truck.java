public class Truck extends Vehicle {
    private int numberOfWheels;

    public Truck(String b, String m, int y, int numberOfWheels) {
        super(b, m, y); 
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}