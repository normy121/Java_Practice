import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum);

        Scanner obj = new Scanner(System.in);
        System.out.print("Type a number: ");
        x = obj.nextInt();

        System.out.print("Type another number: ");
        y = obj.nextInt();

        sum = x + y;
        System.out.println("Sum is " + sum + ".");
        obj.close();
    }
}
