public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        timeValidator(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void timeValidator(int hours, int minutes, int seconds) {
        hoursValidator(hours);
        minutesValidator(minutes);
        secondsValidator(seconds);
    }

    private void hoursValidator(int hours) {
        boolean isHours = hours < 0 || hours >= 24;
        if(isHours) throw new IllegalArgumentException("Invalid Hour");
    }

    private void minutesValidator(int minutes) {
        boolean isMinutes = minutes < 0 || minutes >= 60;
        if(isMinutes) throw new IllegalArgumentException("Invalid Minutes");
    }

    private void secondsValidator(int seconds) {
        boolean isSeconds = seconds < 0 || seconds >= 60;
        if(isSeconds) throw new IllegalArgumentException("Invalid Seconds");
    }

    public void setTime(int hours, int minutes, int seconds) {
        timeValidator(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
