import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getQueueSize() {
        return this.queue.size();
    }

    public void addPassengerToQueue(Passenger passenger) {
        this.queue.add(passenger);
    }
}
