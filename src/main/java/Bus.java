import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Passenger> passengers;
    private int capacity;

    public Bus(String destination) {
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.capacity = 10;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.getPassengerCount() < capacity) {
            this.passengers.add(passenger);
        }

    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
