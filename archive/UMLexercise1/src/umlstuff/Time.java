package umlstuff;

public class Time {

    private int hour, minute, second, timeInSeconds;

    public void Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.timeInSeconds = second + minute*60 +hour*3600;
    }
    
    public void convertSecondsToTime(int timeInSeconds){
        this.timeInSeconds = timeInSeconds;
        this.hour = timeInSeconds / 3600;
        this.minute = timeInSeconds % 3600 / 60;
        this.second = timeInSeconds % 60;
    }
    
    public void nextSecond(){
        this.timeInSeconds++;
        convertSecondsToTime(timeInSeconds);
    }
    
    public void previousSecond(){
        this.timeInSeconds--;
        convertSecondsToTime(timeInSeconds);
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

}
