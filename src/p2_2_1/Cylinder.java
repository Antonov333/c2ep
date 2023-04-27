package p2_2_1;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        this.height = height;
        setRadius(radius);
        setVolume(height * PI * getRadius() * getRadius());
    }

    public double getHeight() {
        return height;
    }
}
