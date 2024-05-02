public class Circle {
    double radius;

    // Adding a default constructor

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() { // Renamed from getpermiter to getPerimeter
        return Math.PI * 2 * radius;
    }
}


public class classtestchat {
    public static void main(String[] args) { // Correct main method signature
        Circle circle1 = new Circle(); // This will now work due to the default constructor
        System.out.println(circle1.getArea());
    }
}
