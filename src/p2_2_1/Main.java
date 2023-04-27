package p2_2_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Shapes...");
        Box box = new Box(random.nextDouble(500.0, 1000.0));
        System.out.println("box.getVolume() = " + box.getVolume());

        Ball ball = new Ball(3.0);
        System.out.println("ball.getVolume() = " + ball.getVolume());

        box.add(ball);

        Cube cube = new Cube(5.0);
        System.out.println("cube.getVolume() = " + cube.getVolume());

        box.add(cube);

        Brick brick = new Brick(random.nextDouble(10.0), random.nextDouble(5.0), random.nextDouble(5.0));
        System.out.println(Arrays.toString(brick.getDimensions()));
        brick.printDimensions();

        box.add(brick);

    }


}