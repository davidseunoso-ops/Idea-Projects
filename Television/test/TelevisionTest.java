import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelevisionTest {

    @Test
    public void testThatTheTelevision_CanBeTurnedOn() {
        Television television = new Television();

        television.turnOn();
        Assertions.assertTrue(television.getPowerOn());
    }

    @Test
    public void testThatTheTelevision_CanBeTurnedOff() {
        Television television = new Television();

        television.turnOn();
        television.turnOff();

        Assertions.assertFalse(television.getPowerOn());
    }

    @Test
    public void testThatTheTelevisionVolume_CanBeIncreased() {
        Television television = new Television();

        television.turnOn();
        television.increaseVolume();
        television.increaseVolume();

        Assertions.assertEquals(2, television.getVolume());
    }

    @Test
    public void testThatTheTelevisionVolume_CanBeDecreased() {
        Television television = new Television();

        television.turnOn();
        television.increaseVolume();
        television.increaseVolume();

        television.decreaseVolume();

        Assertions.assertEquals(1, television.getVolume());
    }

    @Test
    public void testThatTheTelevision_CanChangeChannelUp() {
        Television television = new Television();

        television.turnOn();
        television.channelUp();
        television.channelUp();

        Assertions.assertEquals(2,television.getChannel());
    }

    @Test
    public void testThatTheTelevision_CanChangeChannelDown() {
        Television television = new Television();

        television.turnOn();
        television.channelUp();
        television.channelUp();

        television.channelDown();

        Assertions.assertEquals(1, television.getChannel());
    }

    @Test
    public void testThatWhenTelevisionIsOff_ChannelCannotChange() {
        Television television = new Television();

        television.channelUp();
        Assertions.assertEquals(0, television.getChannel());

        television.channelDown();
        Assertions.assertEquals(0, television.getChannel());
    }

    @Test
    public void testThatVolume_CannotDecreaseBelowZero() {
        Television television = new Television();

        television.turnOn();
        television.decreaseVolume();

        Assertions.assertEquals(0, television.getVolume());
    }

    @Test
    public void testThatVolume_CannotIncreaseHigherThan100() {
        Television television = new Television();

        television.turnOn();

        for (int index = 0; index < 105; index++) {
            television.increaseVolume();
        }
        Assertions.assertEquals(100, television.getVolume());
    }


    @Test
    public void testThatWhenTelevisionIsOff_VolumeCannotChange() {
        Television television = new Television();

        television.increaseVolume();
        Assertions.assertEquals(0, television.getVolume());
    }

    @Test
    public void testThatTelevision_CanIncreaseBrightness() {
        Television television = new Television();

        television.turnOn();
        television.increaseBrightness();
        television.increaseBrightness();

        Assertions.assertEquals(12, television.getBrightness());
    }

    @Test
    public void testThatTelevision_CanDecreaseBrightness() {
        Television television = new Television();

        television.turnOn();
        television.increaseBrightness();
        television.increaseBrightness();

        television.decreaseBrightness();

        Assertions.assertEquals(11, television.getBrightness());
    }

    @Test
    public void testThatTelevision_CanBeMuted() {
        Television television = new Television();

        television.turnOn();
        television.muteTelevision();

        Assertions.assertTrue(television.getMute());
    }

    @Test
    public void testThatTelevision_CanBeUnmuted() {
        Television television = new Television();

        television.turnOn();
        television.unmuteTelevision();

        Assertions.assertFalse(television.getMute());
    }
}