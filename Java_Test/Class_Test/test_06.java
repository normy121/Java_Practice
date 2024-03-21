public class test_06 {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    int x = 6;
    public static void main(String[] args) {
        test_06 myObj1 = new test_06();
        test_06 myObj2 = new test_06();
        myObj1.x = 40;  // If x has final attribute, it will cause error.
        System.out.println(myObj1.x); 
        System.out.println(myObj2.x);
        System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
        System.out.println("Age: " + myObj1.age);
    }
}
