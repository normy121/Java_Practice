import java.util.HashMap;

public class hashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London"); // similar to add
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("England")); // Delete the key's whole set (key+value)
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        //capitalCities.clear(); // Clear all  
        //System.out.println(capitalCities); 

        for (String i : capitalCities.keySet()) {
            System.out.print(i);
        }
        System.out.println();

        for (String i : capitalCities.values()) {
            System.out.print(i);
        }
        System.out.println();

        for (String i : capitalCities.keySet()){
            System.out.println("Key: " + i + ", value: " + capitalCities.get(i) + ".");
        }

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()){
            System.out.println("Key: " + i + ", value: " + people.get(i) + ".");
        }
    }    
}
