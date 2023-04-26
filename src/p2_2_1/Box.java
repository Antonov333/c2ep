package p2_2_1;

public class Box extends Shape {
    private double added = 0.0;

    public Box(double volume) {
        setVolume(volume);
    }

    public boolean add(Shape shape) {
        if (added + shape.getVolume() <= getVolume()) {
            added = added + shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

}
