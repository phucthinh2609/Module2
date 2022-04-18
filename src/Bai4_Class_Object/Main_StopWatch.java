package Bai4_Class_Object;

public class Main_StopWatch {
    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        a.start();
        a.end();
        System.out.println(a.getElapsedTime());
    }
}
