import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class newFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            // File myObj = new File("C:\\Users\\MyName\\filename.txt"); Assign to specific path.
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) { // IOException
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}