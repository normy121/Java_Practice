public class test_14_1 {
    abstract class Shape {
        // Abstract method to calculate area
        public abstract double calculateArea();
    }
        
    class Circle extends Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;   // Use this. to get private in its class.
        }
        
        // Implementing abstract method to calculate area for Circle
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
        
        // Implementing abstract method to calculate area for Rectangle
        @Override
        public double calculateArea() {
            return width * height;
        }
    }
    
    public static void main(String[] args) {
        test_14_1 obj = new test_14_1();

        Circle circle = obj.new Circle(5);
        Rectangle rectangle = obj.new Rectangle(4, 6);
    
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
