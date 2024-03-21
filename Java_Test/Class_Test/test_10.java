public class test_10 {
    class Person {
        protected String fname = "John";    // Protected attribute only access when
        protected String lname = "Doe";     // 1. Classes or subclasses (extend) that are in the same package with the class that has protected attribute.
        protected String email = "john@doe.com";
        protected int age = 24;
    }
      
    class Student extends Person {  //  Subclass that is in the same package.
        private int graduationYear = 2018;
    }
      
    public static void main(String[] args) {
        test_10 outerObj = new test_10();
        Student myObj = outerObj.new Student(); // Call Student to get graduationYear = 2018.
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
