public class Television {

    private boolean powerOn;
    private int volume = 0;
    private int channel;
    private int brightness = 10;
    private boolean mute;

    public boolean getPowerOn() {
        return powerOn;
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (powerOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (powerOn && volume > 0) {
            volume--;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void channelUp() {
        if(powerOn && channel < 20) {
            channel++;
        }
    }

    public void channelDown() {
        if(powerOn && channel > 1) {
            channel--;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseBrightness() {
        if(powerOn && brightness < 100) {
            brightness++;
        }
    }

    public void decreaseBrightness() {
        if(powerOn && brightness > 10) {
            brightness--;
        }
    }

    public boolean getMute() {
        return mute;
    }

    public void muteTelevision() {
        mute = true;
    }

    public void unmuteTelevision() {
        mute = false;
    }
}
