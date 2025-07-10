// Represents a generic geometric shape
class Shape {
    String color;

    // Constructor for the Shape class
    public Shape(String color) {
        this.color = color;
    }

    // Method to display the shape's color
    public void displayColor() {
        System.out.println("This shape is " + color + ".");
    }

    // Method to calculate the area
    public double calculateArea() {
        System.out.println("Calculating area for a generic shape.");
        return 0.0; // Default or undefined area
    }
}

class Circle extends Shape {
    double radius;

    // Constructor for the Circle class
    public Circle(String color, double radius) {
        super(color); // Call the constructor of the parent class (Shape)
        this.radius = radius;
    }

    // Overriding the displayColor() method from the Shape class (optional, but shows flexibility)
    public void displayColor() {
        System.out.println("This circle is " + color + ".");
    }

    // Overriding the calculateArea() method for a circle
    public double calculateArea() {
        // Area of a circle: π * radius * radius
        return Math.PI * radius * radius;
    }

    // A specific method for the Circle class
    public void roll() {
        System.out.println("The " + color + " circle is rolling.");
    }
}


class Rectangle extends Shape {
    double length;
    double width;

    // Constructor for the Rectangle class
    public Rectangle(String color, double length, double width) {
        super(color); // Call the constructor of the parent class (Shape)
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea() method for a rectangle
    public double calculateArea() {
        // Area of a rectangle: length * width
        return length * width;
    }

    // A specific method for the Rectangle class
    public void describeSides() {
        System.out.println("The " + color + " rectangle has length " + length + " and width " + width + ".");
    }
}

public class SimpleShapeDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Classes and Inheritance ---");

        // Create objects of different classes
        Shape genericShape = new Shape("transparent");
        Circle redCircle = new Circle("red", 5.0);
        Rectangle blueRectangle = new Rectangle("blue", 4.0, 6.0);

        // Accessing methods
        genericShape.displayColor();
        System.out.println("Generic shape area: " + genericShape.calculateArea());

        System.out.println("\n-------------------------------------");

        redCircle.displayColor(); // Calls the overridden method in Circle
        System.out.println("Red circle area: " + redCircle.calculateArea()); // Calls the overridden method in Circle
        redCircle.roll(); // Calls the Circle-specific method

        System.out.println("\n-------------------------------------");

        blueRectangle.displayColor(); // Calls the inherited method from Shape
        System.out.println("Blue rectangle area: " + blueRectangle.calculateArea()); // Calls the overridden method in Rectangle
        blueRectangle.describeSides(); // Calls the Rectangle-specific method

        System.out.println("\n--- Demonstrating Polymorphism (using Shape references) ---");

        // Use superclass references to hold subclass objects (Polymorphism)
        Shape shape1 = new Circle("green", 7.0);
        Shape shape2 = new Rectangle("yellow", 3.0, 8.0);
        Shape shape3 = new Shape("black"); // A base class object too

        // Call methods on polymorphic references
        System.out.println("\nShape 1 (actually a Circle):");
        shape1.displayColor(); // Calls Circle's displayColor()
        System.out.println("Area: " + shape1.calculateArea()); // Calls Circle's calculateArea()

        System.out.println("\nShape 2 (actually a Rectangle):");
        shape2.displayColor(); // Calls inherited displayColor()
        System.out.println("Area: " + shape2.calculateArea()); // Calls Rectangle's calculateArea()

        System.out.println("\nShape 3 (actually a Shape):");
        shape3.displayColor();
        System.out.println("Area: " + shape3.calculateArea()); // Calls Shape's calculateArea()
    }
}
