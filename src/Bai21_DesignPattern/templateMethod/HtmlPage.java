package Bai21_DesignPattern.templateMethod;

public class HtmlPage extends Page{

    @Override
    protected void printHead() {
        System.out.println("HTML header");
    }

    @Override
    protected void printBody() {
        System.out.println("HTML body");
    }

    @Override
    protected void printFooter() {
        System.out.println("HTML footer");
    }
}
