public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Hình trụ có 2 đáy là: " + super.toString() +
                ", va co chieu cao la: " + height +
                ", the tich la: " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "Blue", 4);
        System.out.print(cylinder.toString());
    }
}
