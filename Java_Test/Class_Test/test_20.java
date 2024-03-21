public class test_20 {
    class OuterClass {
        private int x = 10;
      
        class InnerClass { //Can access outerclass attributesW
            public int myInnerMethod() {
                return x;
            }
        }
    }
      
    public static void main(String[] args) {
        test_20 obj = new test_20();
        test_20.OuterClass myOuter = obj.new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
