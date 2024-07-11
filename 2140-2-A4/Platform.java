public class Platform {
    private String name;
    private int departureTime;

    public Platform(String name, int departureTime) {
        this.name = name;
        this.departureTime = departureTime;
    }

    public String getName() {
        return name;
    }

    public int getDepartureTime() {
        return departureTime;
    }
}
