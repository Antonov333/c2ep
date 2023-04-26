package p2_2_1;

public class Cube extends Brick {

    private double side;

    public Cube(double side) {
        super(side, side, side);
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
