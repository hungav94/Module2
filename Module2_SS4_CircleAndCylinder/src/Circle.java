public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh tron co ban kinh la: " + radius +
                ", co color la: " + color +
                ", co dien tich la: " + getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2,"Red");
        System.out.print(circle.toString());
    }
}
