package p2_2_1;

public class Brick extends Shape {
    private double side;

    public Brick(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
