package p2_2_2_intf;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Shapes implemenation via interface");

        Random r = new Random();

        Box box = new Box(r.nextDouble(500.0, 1000.0));

        Brick brick = new Brick(r.nextDouble(10.0), r.nextDouble(10.0), r.nextDouble(10.0));

        Cube cube = new Cube(r.nextDouble(10.0));

        Ball ball = new Ball(r.nextDouble(5.0));

        box.add(brick);
        box.add(cube);
        box.add(ball);

    }
}
