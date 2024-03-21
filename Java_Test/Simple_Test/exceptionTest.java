public class exceptionTest {
    // throw: Creating custom error
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
    // try catch to change error message and make sure the code after finally can still remain working.
        try { 
            //int[] numbers = {1, 3, 5};
            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            System.out.println(numbers[10]);
        } catch (Exception e){ // Exception
            System.out.println("Array indexing went wrong!");
        } finally {
            System.out.println("The try catch is finished.");
        }

    // Creating custom error, can also use try catch on custom error.
        int age = 15;
        checkAge(age);
        /*try {checkAge(age);}
        catch (Exception e) {
        checkAge(age = 20);}*/
    }
}
