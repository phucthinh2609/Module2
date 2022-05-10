package demoAbstract;

public abstract class Shape {
    public void Draw(){
    }
}

class Circle extends Shape{
    @Override
    public void Draw() {
        System.out.println("Draw circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void Draw() {
        System.out.println("Draw rectangle");
    }
}

class Main {
        public static void main(String[] args) {
            Circle circle = new Circle();
            Rectangle rectangle = new Rectangle();
            circle.Draw();
            rectangle.Draw();
        }
}
