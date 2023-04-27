package p2_2_2_intf;

public class Brick implements ShapeInterface {
    private double a, b, c;

    @Override
    public double getVolume() {
        return a * b * c;
    }

    public void setVolume(double v) {

    }

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

    public double[] getDimensions() {
        return new double[]{a, b, c};
    }

}

