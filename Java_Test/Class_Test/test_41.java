public class test_41 {
    interface StringFunction {
        String run(String str);
    }
        
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!"; //StringFunction run() write in here.
        StringFunction ask = (s) -> s + "?"; //StringFunction run() write in here.
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }  
}
