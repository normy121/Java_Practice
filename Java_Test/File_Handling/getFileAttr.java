import java.io.File;  // Import the File class

public class getFileAttr {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) { // Get file attribute
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

