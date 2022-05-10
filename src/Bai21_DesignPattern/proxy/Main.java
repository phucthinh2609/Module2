package Bai21_DesignPattern.proxy;

public class Main {
    public static void main(String[] args) {
//        ICaculator caculator = new RealCaculator();
//
//        double result = caculator.add(1,Double.MAX_VALUE);
//        System.out.println(result);

        ICaculator caculator = new CaculatorProxy();

        double result = caculator.div(1,0);
        System.out.println(result );
    }
}
