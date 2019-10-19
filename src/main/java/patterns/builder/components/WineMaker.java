package patterns.builder.components;

public class WineMaker {

    private String name;
    private String countryOfOrigin;

    public WineMaker(final String name, final String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(final String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "WineMaker{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
