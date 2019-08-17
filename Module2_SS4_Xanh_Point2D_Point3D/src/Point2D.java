public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

//    public void setXY(float x, float y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public float[] getXY() {
//        float[] a = {this.x, this.y};
//        return a;
//    }

    public String toString() {
        return "Point2D co x la: " + getX() +
                ", y la: " + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D.toString());
    }
}
