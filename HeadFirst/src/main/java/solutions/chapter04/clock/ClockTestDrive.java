package main.java.solutions.chapter04.clock;

public class ClockTestDrive {

    public static void main(String[] args) {

        Clock clock = new Clock();

        clock.setTime("1245");
        String time = clock.getTime();
        System.out.print("Time: " + time);
    }
}
