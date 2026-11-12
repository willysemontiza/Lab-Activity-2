public class Motorcycle extends Vehicle implements Serviceable {

    private String engineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineType);
        System.out.println("Age: " + calculateAge());
        System.out.println("Vintage: " + isVintage());
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle : inspect the chain and check the brakes.");
    }
}