public class threadTest_01 extends Thread{ // You can multi-threading using extends Thread.
    public void run () { // Overriding run() method
        System.out.println("This code is running in a thread!");
    }

    public static void main(String[] args) {
        threadTest_01 obj = new threadTest_01();
        obj.start(); // Use start() to start multi-threading.
        System.out.println("This code is running outside of the thread!");
    }
}
