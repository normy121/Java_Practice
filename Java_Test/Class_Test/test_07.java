public class test_07 {  // static vs public (need to declare object first)
    static void myStaticMethod(){
        System.out.println("Static");
    }

    public void myPublicMethod(){
        System.out.println("Public");
    }

    public void fullThrottle(){
        System.out.println("The car is at full throttle.");
    }

    public void speed(int maxSpeed){
        System.out.println("The car is at " + maxSpeed + " max speed.");
    }

    public static void main(String[] args) {
        myStaticMethod();   // Call directly.
        //myPublicMethod(); // Error, need declare object first.

        test_07 myObj1 = new test_07(); // Declare object first.
        myObj1.myPublicMethod();
        myObj1.fullThrottle();
        myObj1.speed(40);
    }
}
