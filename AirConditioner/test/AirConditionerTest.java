import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AirConditionerTest {

    @Test
    public void testThatTheAirConditioner_CanBeTurnedOn() {
        Conditioner conditioner = new Conditioner();
        conditioner.turnOn();
        Assertions.assertTrue(conditioner.getRemote());
    }

    @Test
    public void testThatTheAirConditioner_CanBeTurnedOff() {
        Conditioner conditioner = new Conditioner();

        conditioner.turnOn();
        conditioner.turnOff();

        Assertions.assertFalse(conditioner.getRemote());
    }

    @Test
    public void testAirConditionerTemperature_CanBeIncreased() {
        Conditioner conditioner = new Conditioner();

        conditioner.turnOn();
        conditioner.acTemperatureIncreased();

        Assertions.assertEquals(17, conditioner.getTemperature());
    }

    @Test
    public void testAirConditionerTemperature_CanBeDecreased() {
        Conditioner conditioner = new Conditioner();

        conditioner.turnOn();
        conditioner.acTemperatureIncreased();
        conditioner.acTemperatureIncreased();

        conditioner.acTemperatureDecreased();
        Assertions.assertEquals(17, conditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerTemperature_CannotIncreaseBeyond30() {
        Conditioner conditioner = new Conditioner();
        conditioner.turnOn();

        for (int index = 0; index < 16; index++) {
            conditioner.acTemperatureIncreased();
        }
        Assertions.assertEquals(30, conditioner.getTemperature());
    }

    @Test
    public void testTheAirConditionerTemperature_CannotDecreaseBeyond16() {
        Conditioner conditioner = new Conditioner();
        conditioner.turnOn();

        for (int index = 0; index < 10; index ++) {
            conditioner.acTemperatureDecreased();
        }
        Assertions.assertEquals(16, conditioner.getTemperature());
    }
}
