public class CircleDemo {
    public static void main(String[] args) {
        // Creating an instance using the constructor
        Circle circle1 = new Circle(5.0);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.computeArea());

        // Using setter to update radius
        Circle circle2 = new Circle(0.0); // Initialize with 0
        circle2.setRadius(7.0);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.computeArea());
    }
}
