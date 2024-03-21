//import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;

public class timeTest {
    public static void main(String[] args) {
        //LocalDate obj = LocalDate.now(); // Create a LocalDate object.
        //LocalTime obj = LocalTime.now();
        LocalDateTime obj = LocalDateTime.now();  // T in the output is used to separate Date and Time
        System.out.println("Local Date Time before formatting: " + obj);    //  Display current date
        DateTimeFormatter form = DateTimeFormatter.ofPattern("YYYY/MM/dd HH/mm/ss"); // Set format
        // (Y = year, M = month, d = day, H = hour, m = minute, s = second)
        String realtime = obj.format(form); // Make raw data become format-like data
        System.out.println("Local Date Time after formatting: " + realtime);
    }
}
