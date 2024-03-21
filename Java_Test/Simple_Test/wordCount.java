public class wordCount {
    public static void main(String[] args) {
        String words = "One   Two   Three   Four";
        int wordCount = words.split("\\s+").length; // "\\s+" means all whitespaces in the string.
        System.out.println(wordCount);
    }
}