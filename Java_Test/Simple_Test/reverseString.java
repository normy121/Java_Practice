public class reverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse_str = "";
        for (int i = 0; i < str.length(); i++){
            reverse_str = str.charAt(i) + reverse_str; // You need charAt to index element in the
        }
        System.out.println(reverse_str);
    }
}
