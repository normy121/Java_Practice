public class recurTest {
    // overloading: if the function name is the same but with different return type, it will work depending on input type.
    static int addition(int inNum_1, int inNum_2){
        return inNum_1 + inNum_2;
    }

    static double addition(double inNum_1, double inNum_2){
        return inNum_1 + inNum_2;
    }

    public static void main(String[] args) {
        int num_1 = 4, num_2 = 6;
        double donum_1 = 4.3, donum_2 = 6.26;
        System.out.println("Addition result is " + addition(num_1, num_2));
        System.out.println("Addition result is " + addition(donum_1, donum_2)); // Use math.BigDecimal to avoid floating precision problem.
        System.out.println("Addition result is " + recurAdd(5, 10));
    }

    public static int recurAdd(int start, int end){ // Recursive addition
        if(start > end){
            return start + recurAdd(--start, end);
        }
        else if(start < end){
            return start + recurAdd(++start, end);
        }
        else{
            return end;
        }
    }
}