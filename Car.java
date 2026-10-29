public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String b, String m, int y, int doors) {
        super(b, m, y); 
        this.numberOfDoors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Doors: " + numberOfDoors);
    }
}