public class test_11 {
    public class Person {
        private String fname = "John";  // Set
        private String lname = "Doe";
        private String email = "john@doe.com";
        private int age = 24;
    
        // Accessor methods to retrieve private attributes  // Get
        public String getFname() {
            return fname;
        }
    
        public String getLname() {
            return lname;
        }
    
        public String getEmail() {
            return email;
        }
    
        public int getAge() {
            return age;
        }
    }
    
    public static void main(String[] args) {
        test_11 outerObj = new test_11();        
        Person person = outerObj.new Person();
            
        // Accessing private attributes using accessor methods
        System.out.println("Name: " + person.getFname() + " " + person.getLname());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Age: " + person.getAge());
    }
    
}
