package p2_2_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Shapes...");
        Box box = new Box(random.nextDouble(500.0, 1000.0));
        System.out.println("box.getVolume() = " + box.getVolume());

        Ball ball = new Ball(random.nextDouble(5.0));
        System.out.println("ball.getVolume() = " + ball.getVolume());

        box.add(ball);

        Cube cube = new Cube(random.nextDouble(7.0));
        System.out.println("cube.getVolume() = " + cube.getVolume());

        box.add(cube);

        Brick brick = new Brick(random.nextDouble(10.0), random.nextDouble(5.0), random.nextDouble(5.0));
        System.out.println(Arrays.toString(brick.getDimensions()));
        brick.printDimensions();

        Pyramid pyramid = new Pyramid(random.nextDouble(7.0), random.nextDouble(7.0));
        System.out.println("pyramid.getVolume() = " + pyramid.getVolume());

        Cylinder cylinder = new Cylinder(random.nextDouble(5.0), random.nextDouble(10.0));
        System.out.println("cylinder.getVolume() = " + cylinder.getVolume());

        box.add(brick);
        box.add(pyramid);
        box.add(cylinder);

    }


}