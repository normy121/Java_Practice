import java.util.LinkedList; //just like linkedlist, but you can only operate on first or last node
public class linkedListTest {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addFirst("a");
        System.out.println(cars);
        cars.addLast("b");
        System.out.println(cars);
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
