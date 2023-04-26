package p2_2_1;

public class Box extends Shape {
    private double added = 0.0;

    public Box(double volume) {
        setVolume(volume);
    }

    public double getAdded() {
        return added;
    }

    public boolean add(Shape shape) {
        if (added + shape.getVolume() <= getVolume()) {
            added = added + shape.getVolume();
            System.out.println("added figure of " + shape.getVolume());
            System.out.println("At the moment loaded " + added + " of " + getVolume() + " total volume");
            return true;
        } else {
            System.out.println("no more available space in the box: " + (double) (getVolume() - added) + " available while "
                    + shape.getVolume() + " required");
            return false;
        }
    }

}
