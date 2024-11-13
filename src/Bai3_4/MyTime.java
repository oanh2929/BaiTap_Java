package Bai3_4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    // Constructor không tham số
    public MyTime() {}

    // Constructor với các tham số hour, minute, second
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second); // Sử dụng phương thức setTime để kiểm tra giá trị hợp lệ
    }

    // Phương thức setTime để thiết lập giờ, phút, giây (có kiểm tra giá trị hợp lệ)
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }

    // Getter cho hour, minute, second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setter cho hour, minute, second
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }

    // Phương thức toString để hiển thị thời gian theo định dạng "HH:MM:SS"
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Các phương thức nextSecond, nextMinute, nextHour
    public MyTime nextSecond() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 23) {
            hour++;
        } else {
            hour = 0;
        }
        return this;
    }

    // Các phương thức previousSecond, previousMinute, previousHour/-strong/-heart:>:o:-((:-h public MyTime previousSecond() {
        if (second > 0) {
        second--;
    } else {
        second = 59;
        previousMinute();
    }
        return this;
}

public MyTime previousMinute() {
    if (minute > 0) {
        minute--;
    } else {
        minute = 59;
        previousHour();
    }
    return this;
}

public MyTime previousHour() {
    if (hour > 0) {
        hour--;
    } else {
        hour = 23;
    }
    return this;
}
}
