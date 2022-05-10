package Bai21_DesignPattern.templateMethod;

public class PdfPage extends Page{
    @Override
    protected void printHead() {
        System.out.println("PDF header");
    }

    @Override
    protected void printBody() {
        System.out.println("PDF body");
    }

    @Override
    protected void printFooter() {
        System.out.println("PDF footer");
    }
}
