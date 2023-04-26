package p2_2_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shapes...");
        Box box = new Box(1000.0);
        System.out.println("box.getVolume() = " + box.getVolume());

        Ball ball = new Ball(3.0);
        System.out.println("ball.getVolume() = " + ball.getVolume());

        box.add(ball);

        Cube cube = new Cube(5.0);
        System.out.println("cube.getVolume() = " + cube.getVolume());

        box.add(cube);

    }


}