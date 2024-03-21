public class test_17 {
    class Vehicle {
        protected String brand = "Ford";        // Vehicle attribute
        public void honk() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }
  
    class Car extends Vehicle {
        private String modelName = "Mustang";    // Car attribute, can be accessed by main method in the test_17 (same class)
    } 

    public static void main(String[] args) {
        test_17 obj = new test_17();
        // Create a myCar object
        test_17.Car myCar = obj.new Car();
    
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
    
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
