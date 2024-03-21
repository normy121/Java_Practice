public class test_12 {
    public class OuterClass {
        private int privateAttribute;
        protected int protectedAttribute;
    
        public OuterClass(int privateAttribute, int protectedAttribute) {   //set
            this.privateAttribute = privateAttribute;
            this.protectedAttribute = protectedAttribute;
        }
    
        public class InnerClass {   //get
            public void displayAttributes() {
                System.out.println("Private Attribute: " + privateAttribute);
                System.out.println("Protected Attribute: " + protectedAttribute);
            }
        }
    }
    
    public static void main(String[] args) {
        test_12 outerInstance = new test_12(); // Create an instance of test_12
        test_12.OuterClass outer1 = outerInstance.new OuterClass(10, 20); // Create an instance of OuterClass
        test_12.OuterClass outer2 = outerInstance.new OuterClass(100, 200); // Create another instance of OuterClass
    
        test_12.OuterClass.InnerClass inner1 = outer1.new InnerClass(); // Create an instance of InnerClass associated with outer1
        test_12.OuterClass.InnerClass inner2 = outer2.new InnerClass(); // Create another instance of InnerClass associated with outer2
    
        inner1.displayAttributes(); // Displays attributes of outer1
        inner2.displayAttributes(); // Displays attributes of outer2
    }
}
