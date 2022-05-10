package Bai21_DesignPattern.templateMethod;

public class Main {
    public static void main(String[] args) {
        Page htmlPage = new HtmlPage();
        Page pdfPage = new PdfPage();

        htmlPage.print();
        pdfPage.print();
    }
}
