package patterns.adapter.screwcapbottle;

public class Bottleneck {
    private final double radius;

    public Bottleneck(final double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    public boolean compatibleWith(final ScrewCap screwCap) {
        return this.getRadius() >= screwCap.getRadius();
    }

    @Override
    public String toString() {
        return "Bottleneck with radius=" + radius;
    }
}