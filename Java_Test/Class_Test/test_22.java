public class test_22 {
    // Interface: a little bit like contract but implementation relies other class
    // Must implement every methods in interface if implemented by classes
    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void sleep(); // interface method (does not have a body)
    }
  
  // Pig "implements" the Animal interface
    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }
  
    public static void main(String[] args) {
        test_22 obj = new test_22();
        test_22.Pig myPig = obj.new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
