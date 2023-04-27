package p2_2_1;

public class Pyramid extends Shape {
    private double baseArea,
            height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
        setVolume(baseArea * height / 3.0);
    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
        setVolume(baseArea * height / 3.0);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        setVolume(baseArea * height / 3.0);
    }
}
