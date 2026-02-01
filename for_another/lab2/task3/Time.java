public class Time{

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        if(hour >= 0 && hour <24){
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }

        if(minute >= 0 && minute < 60){
            this.minute = minute;
        }
        else{
            this.minute = 0;
        }

        if(second >= 0 && second < 60){
            this.second = second;
        }
        else{
            this.second = 0;
        }
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void add(Time t){
        int totalSeconds = this.second + t.second;
        int carryMinute = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = this.minute + t.minute + carryMinute;
        int carryHour = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        this.hour = (this.hour + t.hour + carryHour) % 24;
    }
}