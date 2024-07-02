package Task_2;

public class Box extends Shape {
    private double volumeBox;

    public Box(double volumeBox) {
        super(volumeBox);
        this.volumeBox = volumeBox;
    }

    public boolean add(Shape shape) {
        if (volumeBox >= shape.getVolume()) {
            return true;
        } else {
            return false;
        }
    }
}