import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BikeTest {

    @Test
    public void testThatTheBike_CanBeTurnedOn() {
        Bike bike = new Bike();
        bike.turnOnBike();
        Assertions.assertTrue(bike.getBike());
    }

    @Test
    public void testThatTheBike_CanBeTurnedOff() {
        Bike bike = new Bike();

        bike.turnOnBike();
        bike.turnOffBike();

        Assertions.assertFalse(bike.getBike());
    }

    @Test
    public void testThatTheBike_CanBeAccelerated() {
        Bike bike = new Bike();
        bike.turnOnBike();

        bike.accelerate(15);
        Assertions.assertEquals(15, bike.getAcceleration());
    }

    @Test
    public void testThatTheBike_CanBeDeccelerated() {
        Bike bike = new Bike();
        bike.turnOnBike();

        bike.accelerate(15);
        bike.deccelerate(5);

        Assertions.assertEquals(10, bike.getAcceleration());
    }

    @Test
    public void testThatGear_ChangesBasedOnSpeed() {
        Bike bike = new Bike();
        bike.turnOnBike();

        bike.accelerate(45);

        Assertions.assertEquals(4, bike.getCurrentGear());
    }
}
