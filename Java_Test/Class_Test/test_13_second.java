public class test_13_second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from test_13)
        Student myObj = new Student();  //Call subclass that is forced to do study() so that calling twice is not needed.
    
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}
