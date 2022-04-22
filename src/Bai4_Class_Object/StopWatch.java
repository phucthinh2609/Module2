package Bai4_Class_Object;

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public StopWatch(){
        startTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime(){
        long elapsed;
        if(running)
            elapsed = (System.currentTimeMillis() - startTime);
        else
            elapsed = (endTime - startTime);
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        a.start();
//        a.end();
        a.getElapsedTime();
        System.out.println("Result "+a.getElapsedTime());
    }
}
