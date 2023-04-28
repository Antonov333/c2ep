package p2_2_2_intf;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super.setRadius(radius);
    }

    @Override
    public void setVolume(double volume) {
    }

    @Override
    public double getVolume() {
        return 4.0 * PI * getRadius() * getRadius() * getRadius() / 3.0;
    }
}
