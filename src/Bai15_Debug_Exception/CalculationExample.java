package Bai15_Debug_Exception;

public class CalculationExample {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter x: ");
//        int x = input.nextInt();
//        System.out.println("Enter y: ");
//        int y = input.nextInt();

        CalculationExample calEx = new CalculationExample();
//        calEx.calculationExample(x, y);
        calEx.calculationExample(5, 5);
        calEx.calculationExample(0, 1);
        calEx.calculationExample(0, 0);
    }

    public void calculationExample(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("\nSum of x,y = " + a);
            System.out.println("Sub of x,y = " + b);
            System.out.println("Multi of x,y = " + c);
            System.out.println("Dev of x,y = " + d);
        }catch (Exception e){
            System.err.println("\nException: " + e.getMessage());
        }
    }
}
