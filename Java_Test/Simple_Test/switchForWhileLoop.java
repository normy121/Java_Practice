public class switchForWhileLoop {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        int day = 4;
        switch (day) {
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
            default:
              System.out.println("Not a day.");
        }
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 5);
      
        for(i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }

        // Outer loop
        for(i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
              System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }
  }