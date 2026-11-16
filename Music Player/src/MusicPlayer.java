public class MusicPlayer {

    private boolean mpIsOn;
    private int volume;
    private boolean bluetooth;
    private boolean isPlaying;
    private boolean isPaused;

    public boolean getMpIsOn() {
        return mpIsOn;
    }

    public void turnOnMp() {
        mpIsOn = true;
    }

    public void turnOffMp() {
        mpIsOn = false;
        isPlaying = false;
        isPaused = false;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(mpIsOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if(mpIsOn && volume > 0) {
            volume--;
        }
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void turnOnBluetooth() {
        bluetooth = true;
    }

    public void turnOffBluetooth() {
        bluetooth = false;
    }
    
    public boolean getIsPlaying() {
        return isPlaying;
    }

    public void pressPlay() {
        if (mpIsOn) {
            isPlaying = true;
            isPaused = false;
        }
    }

    public boolean getIsPaused() {
        return isPaused;
    }

    public void pressPause() {
        if (mpIsOn && isPlaying) {
            isPlaying = false;
            isPaused = true;
        }
    }

    public void pressStop() {
        if (mpIsOn) {
            isPlaying = false;
            isPaused = false;
        }
    }
}
