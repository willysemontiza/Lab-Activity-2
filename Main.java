public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle car2 = new Vehicle("Ford", "Mustang", 1995);
        Vehicle car3 = new Vehicle("Tesla", "Model 3", 2023);

        car1.displayInfo();
        System.out.println("Age: " + car1.calculateAge());
        System.out.println("Vintage: " + car1.isVintage());
        System.out.println();

        car2.displayInfo();
        System.out.println("Age: " + car2.calculateAge());
        System.out.println("Vintage: " + car2.isVintage());
        System.out.println();

        car3.displayInfo();
        System.out.println("Age: " + car3.calculateAge());
        System.out.println("Vintage: " + car3.isVintage());


        System.out.println();
        System.out.println("=== GETTERS ===");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());


        System.out.println();
        System.out.println("=== setYear(2000) ===");
        System.out.println("Return value: " + car1.setYear(2000));
        System.out.println("Stored year: " + car1.getYear());
        System.out.println("Age: " + car1.calculateAge());
        System.out.println("Vintage: " + car1.isVintage());


         System.out.println();
        System.out.println("=== setYear(1885) ===");
        System.out.println("Return value: " + car1.setYear(1885));
        System.out.println("Stored year: " + car1.getYear());


        System.out.println();
        System.out.println("=== setYear(2027) ===");
        System.out.println("Return value: " + car1.setYear(2027));
        System.out.println("Stored year: " + car1.getYear());


        System.out.println();
        System.out.println("=== Constructor with year 1885 ===");
        Vehicle invalidcar1 = new Vehicle("Test", "Vehicle", 1885);
        System.out.println("Initial year: " + invalidcar1.getYear());


        System.out.println();
        System.out.println("=== Constructor with year 2027 ===");
        Vehicle invalidcar2 = new Vehicle("Test", "Vehicle", 2027);
        System.out.println("Initial year: " + invalidcar2.getYear());
    }
}