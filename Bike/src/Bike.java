public class Bike {

    private boolean powerButton;
    private int acceleration = 0;

    public boolean getBike() {
        return powerButton;
    }

    public void turnOnBike() {
        powerButton = true;
    }

    public void turnOffBike() {
        powerButton = false;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void accelerate(int speed) {
        if (powerButton) {
            acceleration += speed;
        }
    }

    public void deccelerate(int speed) {
        if (powerButton) {
            acceleration -= speed;
            if (acceleration < 0) {
                acceleration = 0;
            }
        }
    }

    public int getCurrentGear() {
        if (acceleration <= 20) {
            return 1;
        }
        if (acceleration <= 30) {
            return 2;
        }
        if (acceleration <= 40) {
            return 3;
        }
        if (acceleration <= 50) {
            return 4;
        }
        return 0;
    }
}
