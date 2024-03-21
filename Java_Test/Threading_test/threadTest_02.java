public class threadTest_02 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        threadTest_02 thread = new threadTest_02();
        thread.start(); // Causing concurrency problem, this make it so that the output is unpredictable.
        // Should put something before it affects IO.
        System.out.println(amount); // 0
        amount++;
        System.out.println(amount); // 2
    }

    public void run () {
        amount++;
    }
}
