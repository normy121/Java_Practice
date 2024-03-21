import java.util.ArrayList;
import java.util.Iterator;

public class iteratorTest {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item, whenever getting next(), the iterator goes to the next index.
        System.out.println(it.next());

        while (it.hasNext()) {  // Iterate until there is nothing left in the array.
            System.out.println(it.next());
        }

        ArrayList<Integer> number = new ArrayList<Integer>();
        //ArrayList<int> number = new ArrayList<int>(); WRONG, this is primitive data type, use wrapper class
        number.add(7);
        number.add(3);
        number.add(22);
        number.add(14);
        System.out.println("Before: " + number);
        Iterator<Integer> number_it = number.iterator();
        while (number_it.hasNext()) {
            int i = number_it.next();
            if (i <= 10) {
                number_it.remove();
            }
        }
        System.out.println("After: " + number);
    }
}
