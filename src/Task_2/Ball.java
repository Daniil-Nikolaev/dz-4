package Task_2;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
