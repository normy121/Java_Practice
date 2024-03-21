public class threadTest_03 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        threadTest_03 thread = new threadTest_03();
        thread.start(); // Causing concurrency problem, this make it so that the output is unpredictable.
        // Wait for the thread to finish 
        while(thread.isAlive()){ // Wait for thread to finish, solving concurrency problem.
            System.out.println("Waiting...");
        }
        System.out.println(amount); // 1
        amount++;
        System.out.println(amount); // 2
    }

    public void run () {
        amount++;
    }
}
