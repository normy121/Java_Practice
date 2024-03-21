public class test_24 {
    enum Level{ // Use enum when you have a list of variables you are never going to change.
        LOW,    // enum constant
        Medium,
        High
    }

    public static void main(String[] args) {
        Level myVar = Level.Medium;
        System.out.println(myVar.getClass().getName());

        switch (myVar) {
            case LOW:
                System.out.println("LOW");
                break;
            case Medium:
                System.out.println("Medium");
                break;
            case High:
                System.out.println("High");
                break;
            default:
                break;
        }
        
        //Level.values() will get all the constants in Level
        for (Level var : Level.values()) {  // Cannot reset Level constant with current variable available
            System.out.println(var);    // Need to set new Level constant to speed through for-loop
        }
    }
}
