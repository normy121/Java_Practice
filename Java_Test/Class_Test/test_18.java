public class test_18 {
    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }
      
    class Pig extends Animal { // Overiding method in superclass
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }
      
    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
      
    public static void main(String[] args) {
        test_18 obj = new test_18();
        test_18.Animal myAnimal = obj.new Animal();  // Create a Animal object
        test_18.Animal myPig = obj.new Pig();  // Create a Pig object (subclass)
        test_18.Animal myDog = obj.new Dog();  // Create a Dog object (subclass)
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
