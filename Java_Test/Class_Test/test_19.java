public class test_19 {
    class outerclass {
        int x = 5;
        /*private class innerclass {  //Within test_19 class, this is correct. But without test_19 class, this will cause error.
            int y = 10;
        }*/
        /*class innerclass {  //Need to create outerclass object and then create innerclass object.
            int y = 10;
        }*/
        static class innerclass {  //Only need to create innerclass object.
            int y = 10;
        }
    }

    public static void main(String[] args) {
        //test_19 obj = new test_19();
        /*test_19.outerclass outerobj = obj.new outerclass();
        test_19.outerclass.innerclass innerobj = outerobj.new innerclass(); //inner class practice*/
        test_19.outerclass.innerclass innerobj = new test_19.outerclass.innerclass(); //If static, can call directly.
        //System.out.println("x = " + outerobj.x);
        System.out.println("y = " + innerobj.y);
    }
}
