import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTests {

    private BusStop busStop;
    private Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop("Edinburgh");
        passenger = new Passenger();
    }

    @Test
    public void busStopHasName() {
        assertEquals("Edinburgh", busStop.getName());
    }

    @Test
    public void checkBusStopIsEmpty(){
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addPassengerToQueue(passenger);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void
}
