package p2_2_1;

public class Brick extends Shape {
    private double a, b, c;

    public Brick(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printDimensions() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }
}
