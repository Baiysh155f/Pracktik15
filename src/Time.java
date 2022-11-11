public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String hourNull = "";
        String minutNull = "";
        String secondNull = "";
        String result = null;
        if (hour >= 0 && hour <= 23) {
            if (minute >= 0 && minute <= 59) {
                if (second >= 0 && second <= 59) {
                    if (this.hour <= 9) {
                        hourNull = "0";
                    }
                    if (this.minute <= 9) {
                        minutNull = "0";
                    }
                    if (this.second <= 9) {
                        secondNull = "0";
                    }
                    result = hourNull + hour + ":" + minutNull + minute + ":" + secondNull + second;
                }
            }
        }
        return result;
    }


    public String nextSecond() {
        int counter = 0;
        while (2 > counter) {
            if (second == 59) {
                if (minute == 59) {
                    if (hour == 23) {
                        hour = 0;
                    } else hour++;
                    minute = 0;
                } else minute++;
                second = 0;
            } else second++;
            int i = counter++;
        }
        return toString();
    }

    public String previosSecond() {
        if (second == 0) {
            if (minute == 0) {
                if (hour == 0) hour = 23;
                else hour--;
                minute = 59;
            } else minute--;
            second = 59;
        } else second--;
        return toString();
    }
}