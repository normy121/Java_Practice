import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class readFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt"); // Read file.
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) { // Check if any line left
                String data = myReader.nextLine(); // Read next line
                System.out.println(data);
            }
            myReader.close(); // Need to close file after finished.
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print all error messages
        }
    }
}
