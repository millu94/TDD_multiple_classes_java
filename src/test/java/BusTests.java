import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTests {

    private Bus bus;
    private Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Ayr");
        passenger = new Passenger();
    }

    @Test
    public void checkBusIsEmpty(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengersToBus(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void cantAddPassengersWhenFull(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(10, bus.getPassengerCount());
        bus.addPassenger(passenger);
        assertEquals(10, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }

}
