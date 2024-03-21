
// abstract class
abstract class test_13 {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method forces subclass to execute study() method while normal method doesn't
}
  
// Subclass (inherit from test_13)
class Student extends test_13 {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}

