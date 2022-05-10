package Bai7_AbtractClass_Interface.resizeable;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
//    @Override
//    public void resize(double percent) {
//        setSide(getWidth()*percent);
//    }

}
