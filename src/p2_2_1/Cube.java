package p2_2_1;

public class Cube extends Brick {

    private double side;

    public Cube(double side) {
        super(side, side, side);
        this.side = side;
        setVolume(side * side * side);
    }

    public double getSide() {
        return side;
    }
}
