package Bai21_DesignPattern.templateMethod;

public abstract class Page {
    void print(){
        System.out.println("============");
        printHead();
        printBody();
        printFooter();
        System.out.println("============");
    }

    protected abstract void printHead();
    protected abstract void printBody();
    protected abstract void printFooter();
}
