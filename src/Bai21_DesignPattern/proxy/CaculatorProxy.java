package Bai21_DesignPattern.proxy;

public class CaculatorProxy implements ICaculator{
    private RealCaculator realCaculator;

    public CaculatorProxy() {
        this.realCaculator = new RealCaculator();
    }

    @Override
    public double add(double first, double second) {
        if(first/2 + second/2 >= Double.MAX_VALUE)
            throw new RuntimeException("Out of range");
        if(first/2 + second/2 <= Double.MIN_VALUE)
            throw new RuntimeException("Out of range");

        return this.realCaculator.add(first, second);
    }

    @Override
    public double div(double first, double second) {
        if (second == 0)
            throw new RuntimeException("Can't devide by zero");
        return this.div(first, second);
    }
}
