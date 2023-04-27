package p2_2_2_intf;

public class Box implements ShapeInterface {
    private double volume,
            filledVolume = 0.0;

    public Box(double volume) {
        setVolume(volume);
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void add(Brick brick) {
        if (filledVolume + brick.getVolume() <= getVolume()) {
            filledVolume = filledVolume + brick.getVolume();
            System.out.println("added figure of " + brick.getVolume());
            System.out.println("At the moment loaded " + filledVolume + " of " + getVolume() + " total volume");
        } else {
            System.out.println("no more available space in the box: " + (double) (getVolume() - filledVolume) + " available while "
                    + brick.getVolume() + " required");
        }
    }

}