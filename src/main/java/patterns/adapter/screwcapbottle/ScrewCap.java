package patterns.adapter.screwcapbottle;

public class ScrewCap {
    private double radius;

    protected ScrewCap() {}

    public ScrewCap(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
