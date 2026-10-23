public class Motorcycle extends Vehicle {
   private String engineType;
   public Motorcycle(String b, String m, int y, String e){
      super(b, m, y);
      this.engineType = e;
      }
      
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Engine: " + engineType);
         }
         
      }