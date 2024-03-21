import java.util.Scanner;

public class test_15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);   // Use Scanner class to input.
        System.out.print("Your username: ");

        String username = obj.next();
        System.out.println("Your username: " + username + ".");

        obj.close();    // Remember to close to prevent resource leak.
    }
}
