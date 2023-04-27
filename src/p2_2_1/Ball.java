package p2_2_1;

public class Ball extends SolidOfRevolution {

    public Ball(double r) {
        setRadius(r);
        setVolume((4.0 * PI * r * r * r) / 3.0);
    }

}
