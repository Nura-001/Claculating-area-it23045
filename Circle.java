public class Circle {
    // Private variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return this.radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
