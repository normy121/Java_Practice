import java.util.Scanner;
public class scanSplitString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Please input name, age, and salary: ");
        String input = obj.nextLine();
        String[] inputSequence = input.split(",");  //Split the string by ","

        System.out.println("Name: " + inputSequence[0].trim()); //Clean out whitespace
        System.out.println("Age: " + inputSequence[1].trim());
        System.out.println("Salary: " + inputSequence[2].trim());

        obj.close();
    }
}
