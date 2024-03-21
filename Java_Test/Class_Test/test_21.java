public class test_21 { //You should use abstract when achieving security - 
    //hide certain details and only show the important details of an object.
    abstract class Animal{//Cannot create objects
        public abstract void AnimalSound();
        public void sleep(){
            System.out.println("Zzz");
        }
    }

    class Pig extends Animal {
        public void AnimalSound(){
            System.out.println("The pig says: wee wee");
        }
    }

    public static void main(String[] args) {
        test_21 obj = new test_21();
        test_21.Pig pigobj = obj.new Pig();
        pigobj.AnimalSound();
        pigobj.sleep();
    }
}

