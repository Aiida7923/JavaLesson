package task41;

public class Triangle {

    private double a;
    private double b;
    private double c;
    private static final double sumInteriorAngle = 180.0;
    private static final double sumExteriorAngle = 360.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double getSumInteriorAngle() {
        return sumInteriorAngle;
    }

    public static double getSumExteriorAngle() {
        return sumExteriorAngle;
    }

    public double calcPerimeter() {
        return a + b + c;
    }

    public boolean isIsosceles() {
        return a == b || b == c || c == a;
    }

    public boolean isEquilateral() {
        return a == b && b == c;
    }

    public boolean isCongruent(Triangle triangle) {
        return (a == triangle.a && b == triangle.b && c == triangle.c) ||
                (a == triangle.a && b == triangle.c && c == triangle.b) ||
                (a == triangle.b && b == triangle.a && c == triangle.c) ||
                (a == triangle.b && b == triangle.c && c == triangle.a) ||
                (a == triangle.c && b == triangle.a && c == triangle.b) ||
                (a == triangle.c && b == triangle.b && c == triangle.a);
    }

    public boolean isLineSymmetric() {
        return isIsosceles();
    }

    public static boolean isPointSymmetric() {
        return false;
    }

}
