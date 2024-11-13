package Bai3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Thời gian hiện tại: " + time);

        time.nextSecond();
        System.out.println("Thời gian sau 1 giây: " + time);

        time.previousMinute();
        System.out.println("Thời gian lùi 1 phút: " + time);

        time.setTime(0, 0, 0);
        System.out.println("Thiết lập lại thời gian: " + time);

        time.previousHour();
        System.out.println("Thời gian lùi 1 giờ: " + time);
    }
}

