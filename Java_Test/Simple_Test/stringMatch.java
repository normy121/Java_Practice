import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class stringMatch {  //String Matching
    public static void main(String[] args) { 
        //First parameter is what the Pattern wants to search. (many kinds)
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE); //Doesn't matter if uppercase or lowercase
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
