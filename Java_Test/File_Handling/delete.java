import java.io.File;  // Import the File class

public class delete {
    public static void main(String[] args) { 
        File myObj = new File("filename.txt"); 
        if (myObj.delete()) { // Delete file and folder are the same function.
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        } 
    } 
}

