public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        Vehicle car2 = new Vehicle();
        car2.brand = "Ford";
        car2.model = "Mustang";
        car2.year = 1995; 
        Vehicle car3 = new Vehicle();
        car3.brand = "Tesla";
        car3.model = "Model 3";
        car3.year = 2023;

        Vehicle[] vehicles = {car1, car2, car3};

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("--- Vehicle " + (i + 1) + " ---");
            vehicles[i].displayInfo();
            System.out.println("Age: " + vehicles[i].calculateAge());
            System.out.println("Is Vintage? " + vehicles[i].isVintage());
        }
    }
}