package Oop_encapsulation;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid side value");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
       setSide(side);
    }


    public double calcArea(){
       return side * side;
    }
    public double calcPerimeter(){
        return side * 4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
