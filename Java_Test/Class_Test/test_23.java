public class test_23 { //Java does not have multi inheritance, multi interface is the solution.
    interface FirstInterface {
        public void myMethod(); // interface method
    }
      
    interface SecondInterface {
        public void myOtherMethod(); // interface method
    }
      
    class DemoClass implements FirstInterface, SecondInterface {
        public void myMethod() {
            System.out.println("Some text..");
        }
        public void myOtherMethod() {
            System.out.println("Some other text...");
        }
    }

    public static void main(String[] args) {
        test_23 obj = new test_23();
        test_23.DemoClass myObj = obj.new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
      
}
