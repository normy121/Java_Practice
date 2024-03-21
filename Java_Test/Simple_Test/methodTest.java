public class methodTest {
    static void myMethod(){ // method returns void
        System.out.println("test");
    }

    static void printName(String inString){
        System.out.println("My name is " + inString + ".");
    }
    
    static void printNameAge(String inString, int age){
        System.out.println("My name is " + inString + " and I'm " + age + " years old.");
    }

    static int addition(int inNum_1, int inNum_2){
        return inNum_1 + inNum_2;
    }

    static void checkAge(int age){
        if(age < 18){
            System.out.println("You are only " + age + " which is not allowed in here.");
        }
        else{
            System.out.println("Qualified");
        }
    }

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i:cars){ // Similar to python enumerate
            System.out.println(i);
        }
        
        for(int i = 0; i <= 10; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        int[] num = {1, 2, 3 ,4};
        for(int i:num){ // Similar to python enumerate
            System.out.println(i);
        }
        myMethod();
        myMethod();
        myMethod();
        printName("Liam");
        printName("Adam");
        printName("rio");
        printNameAge("Liam", 7);
        printNameAge("Adam", 22);
        printNameAge("rio", 100);
        int z = addition(3, 5);
        System.out.println(z);
        checkAge(14);
        checkAge(18);
    }
  }