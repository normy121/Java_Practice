import java.util.HashSet;

public class hashSetTest {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    // Cannot repeat with the same string. Therefore, only four elements
        cars.add("Mazda");
        System.out.println(cars); 
        System.out.println(cars.contains("Mazda"));
        cars.remove("Ford");
        System.out.println(cars);
        // cars.clear();
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.print(i + " ");
        }
        System.out.println();

        HashSet<Integer> number = new HashSet<Integer>();
        number.add(8);
        number.add(4);
        number.add(7);
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }    
}
