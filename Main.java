public class Main {

public static void printDetails(Vehicle vehicle){
   vehicle.displayInfo();
}
   public static void main (String[] args ) {
   
   System.out.println("=== 1. Parent Reference ===");
      Vehicle vehicle = new Car ("honda", "Civic", 2008,4);
      vehicle.displayInfo();
      
      
      System.out.println();
      
      vehicle = new Truck ("mitsubishi FUSO", "Canter FE73", 2021,6);
      
       vehicle = new Motorcycle("Yamaha", "Aerox v2",2024, "155cc liquid-cooled, 4-stroke, SOHC, 4-valve single-cylinder Blue Core engine");
       vehicle.displayInfo();
       
      System.out.println("=== 2. Method Parameter ===");
      Car car = new Car("Toyota", "vios", 2002,4);
      Motorcycle motor = new Motorcycle("Honda" , "click v4", 2026, "125cc liquid-cooled eSP engine");
      Truck truck = new Truck("mitsubishi FUSO", "FJ 1823R", 2022,6);
      
      printDetails(truck);
      
      System.out.println("\n=== 3. Polymorphic Array ===");
      
      Vehicle[] vehicles = {
      
         new Car ("toyota", "Corolla Altis", 1966,4),
         new Motorcycle("Yamaha", "Nmax v3", 2026, "155cc Blue Core, liquid-cooled, 4-stroke, SOHC, 4-valve, single-cylinder"),
         new Truck("Isuzu", "NQR75LS", 2017,6)
         };
         
         for(Vehicle currentVehicle: vehicles){
         printDetails(currentVehicle);
         System.out.println();
         }
        
      
      }
         
     
      


}