package p2_2_2_intf;

public abstract class SolidOfRevolution implements ShapeInterface {

    public static double PI = 3.141592653589793;

    private double radius, volume;

    @Override
    public double getVolume() {
        return volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
