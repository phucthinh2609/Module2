package Bai21_DesignPattern.proxy;

public class Caculator implements ICaculator{
    @Override
    public double add(double first, double second) {
        return first+second;
    }

    @Override
    public double div(double first, double second) {
        return first/second;
    }
}
