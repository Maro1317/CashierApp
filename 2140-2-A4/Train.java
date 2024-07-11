public class Train {
    private String name;
    private int arrival;
    private int departure;

    public Train(String name, int arrival, int departure) {
        this.name = name;
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getName() {
        return name;
    }

    public int getArrival() {
        return arrival;
    }

    public int getDeparture() {
        return departure;
    }
}
