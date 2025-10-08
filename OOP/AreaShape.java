/*4 Area Calculator
Create a base class Shape with a method calculateArea().
 Create subclasses Rectangle, Circle, and Triangle.
Override the method in each subclass to compute and return the correct area based on user input.
 Input: dimensions like radius, length, breadth, etc.
Output: respective area */


import java.util.*;

// Base class
class Shape {
    // Overridden in subclasses
    double calculateArea() {
        return 0;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

// Circle subclass
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    int breadth, height;

    Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (breadth * height) / 2.0;
    }
}

// Main class
public class AreaShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        // Polymorphism demonstration
        Shape s;

        s = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + s.calculateArea());

        s = new Circle(radius);
        System.out.println("Area of Circle: " + s.calculateArea());

        s = new Triangle(breadth, height);
        System.out.println("Area of Triangle: " + s.calculateArea());
    }
}
/*
output:
Enter Radius: 10
Enter Length: 10
Enter Breadth: 10
Enter Height: 25
Area of Rectangle: 100.0
Area of Circle: 314.1592653589793
Area of Triangle: 125.0 */