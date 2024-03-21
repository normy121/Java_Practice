import java.util.ArrayList; // just like Array
import java.util.Collections; // Use Collections to sort
public class arraySort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");  
        cars.add("BMW");    // Can repeat with the same string
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0)); // get the index element
        cars.set(0, "Opel"); // Set element in index 0 to "Opel"
        System.out.println(cars);
        System.out.println("Array size: " + cars.size());
        cars.remove(1); // Remove element in index 1;
        System.out.println(cars);
        cars.clear();   // Clear everything in the array
        System.out.println(cars);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        
        ArrayList<Integer> number = new ArrayList<Integer>();  // Integer
        number.add(200);
        number.add(50);
        number.add(900);
        number.add(600);
        System.out.println(number);
        Collections.sort(number); // sort
        System.out.println(number);
                
    }
}
