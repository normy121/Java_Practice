public class runnableTest implements Runnable { // You can multi-threading using implements Runnable.
    public void run () {
        System.out.println("This code is running in a thread!");
    }

    public static void main(String[] args) {
        runnableTest obj = new runnableTest();
        Thread thread = new Thread(obj); // If using implements Runnable, you need to call thread object.
        thread.start(); // Use start() to start the thread.
        System.out.println("This code is running outside of the thread!");
    }
}
