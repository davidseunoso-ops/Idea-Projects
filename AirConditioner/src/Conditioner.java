public class Conditioner {

    private boolean isOn;
    private int temperature = 16;

    public boolean getRemote() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void acTemperatureIncreased() {
        if (temperature < 30) {
            temperature ++;
        }
    }

    public void acTemperatureDecreased() {
        if (temperature > 16) {
            temperature --;
        }
    }
}