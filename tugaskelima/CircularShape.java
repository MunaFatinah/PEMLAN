package praktic.geometry.bases;

public abstract class CircularShape extends Shape {
    private double radius;
    protected static final int PI_NUMERATOR = 22;
    protected static final int PI_DENOMINATOR = 7;

    public CircularShape() {}

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getRadius() {
        return radius;
    }
}
