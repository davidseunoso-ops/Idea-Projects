import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MusicPlayerTest {

    @Test
    public void testThatMusicPlayer_CanBeTurnedOn() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        Assertions.assertTrue(musicPlayer.getMpIsOn());
    }

    @Test
    public void testThatMusicPlayer_CanBeTurnedOff() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.turnOffMp();

        Assertions.assertFalse(musicPlayer.getMpIsOn());
    }

    @Test
    public void testThatMusicPlayerVolume_CanBeIncreased() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.increaseVolume();
        musicPlayer.increaseVolume();

        Assertions.assertEquals(2, musicPlayer.getVolume());
    }

    @Test
    public void testThatMusicPlayerVolume_CanBeDecreased() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.increaseVolume();
        musicPlayer.increaseVolume();

        musicPlayer.decreaseVolume();
        Assertions.assertEquals(1, musicPlayer.getVolume());
    }

    @Test
    public void testThatMusicPlayer_CannotIncreaseVolumeWhenOff() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOffMp();
        musicPlayer.increaseVolume();
        Assertions.assertEquals(0, musicPlayer.getVolume());
    }

    @Test
    public void testThatMusicPlayer_CannotDecreaseVolumeWhenOff() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOffMp();
        musicPlayer.decreaseVolume();
        Assertions.assertEquals(0, musicPlayer.getVolume());
    }

    @Test
    public void testThatMusicPlayerBluetooth_CanBeTurnedOn() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.turnOnBluetooth();

        Assertions.assertTrue(musicPlayer.getBluetooth());
    }

    @Test
    public void testThatMusicPlayerBluetooth_CanBeTurnedOff() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.turnOffBluetooth();

        Assertions.assertFalse(musicPlayer.getBluetooth());
    }

    @Test
    public void testThatMusicPlayer_CanPlayMusic() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.pressPlay();

        Assertions.assertTrue(musicPlayer.getIsPlaying());
        Assertions.assertFalse(musicPlayer.getIsPaused());
    }

    @Test
    public void testThatMusicPlayer_CanPauseMusic() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.pressPlay();
        musicPlayer.pressPause();

        Assertions.assertFalse(musicPlayer.getIsPlaying());
        Assertions.assertTrue(musicPlayer.getIsPaused());
    }

    @Test
    public void testThatMusicPlayer_CanStopMusic() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOnMp();
        musicPlayer.pressPlay();
        musicPlayer.pressStop();

        Assertions.assertFalse(musicPlayer.getIsPlaying());
        Assertions.assertFalse(musicPlayer.getIsPaused());
    }

    @Test
    public void testThatMusicPlayer_CannotPlayWhenOff() {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.turnOffMp();
        musicPlayer.pressPlay();

        Assertions.assertFalse(musicPlayer.getIsPlaying());
    }
}
