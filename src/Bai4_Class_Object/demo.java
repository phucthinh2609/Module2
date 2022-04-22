package Bai4_Class_Object;

public class demo {
    private long startTime = 0;
    private long stopTime = 0;

    public demo()
    {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println("StopWatch: " + getElapsedTimeSecs() + " seconds.");
    }

    public void stop(String process_name) {
        stopTime = System.currentTimeMillis();
        System.out.println(process_name + " StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println(process_name + " StopWatch: " + getElapsedTimeSecs() + " seconds.");
    }

    //elaspsed time in milliseconds
    public long getElapsedTime() {
        return stopTime - startTime;
    }

    //elaspsed time in seconds
    public double getElapsedTimeSecs() {
        double elapsed;
        elapsed = ((double)(stopTime - startTime)) / 1000;
        return elapsed;
    }

    public static void main(String[] args) {
        demo watch = new demo();
// do something
        watch.start();
        watch.stop();
    }
}
