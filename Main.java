public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        System.out.println("=== 1. Create Objects ===");

        Car car = new Car("honda", "Civic", 2008, 4);

        Motorcycle motor = new Motorcycle(
            "Yamaha",
            "Aerox v2",
            2024,
            "155cc liquid-cooled, 4-stroke, SOHC, 4-valve single-cylinder Blue Core engine"
        );

        Truck truck = new Truck(
            "mitsubishi FUSO",
            "Canter FE73",
            2021,
            6
        );

        Printer printer = new Printer();


        System.out.println("\n=== 2. Interface Polymorphism ===");

        Serviceable[] serviceItems = {
            car, motor, truck, printer
        };

        for (Serviceable item : serviceItems) {
            performService(item);
        }


        System.out.println("\n=== 3. Vehicle Polymorphism ===");

        Vehicle[] vehicles = {
            car, motor, truck
        };

        for (Vehicle currentVehicle : vehicles) {
            currentVehicle.displayInfo();
            currentVehicle.move();

            System.out.println();
        }


        System.out.println("=== Serviceable Items ===");

        Serviceable[] serviceableItems = {
            car, motor, truck, printer
        };

        for (Serviceable item : serviceableItems) {
            performService(item);
            System.out.println();
        }
    }
}