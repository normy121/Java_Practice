public class test_14_2 {    //  class with public can be accessed in any packages.(from other files)
    class Shape {   //  class without public can only be accessed in the same package(test_14_2)
        // Default implementation of calculateArea method
        public double calculateArea() {
            return 0; // Default implementation returns 0 (needs to have body but does not need to execute)
        }
    }
    
    class Circle extends Shape {
        private double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        // Overriding calculateArea method for Circle
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    
    class Rectangle extends Shape {
        private double width;
        private double height;
    
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    
        // Overriding calculateArea method for Rectangle
        @Override
        public double calculateArea() {
            return width * height;
        }
    }
    
    public static void main(String[] args) {
        test_14_2 obj = new test_14_2();
        
        Circle circle = obj.new Circle(5);
        Rectangle rectangle = obj.new Rectangle(4, 6);
    
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }  
}
