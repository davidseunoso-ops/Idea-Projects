public class MusicPlayer {

    private boolean mpIsOn;
    private int volume;

    public boolean getMpIsOn() {
        return mpIsOn;
    }

    public void turnOnMp() {
        mpIsOn = true;
    }

    public void turnOffMp() {
        mpIsOn = false;
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
}
