public class Square extends Rectangle{
    private double side;

    public Square ( double side){
        super("Square", side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
    }
}
