package Abstract;

public class Square extends Rectangle{
    Square(){};
    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    double getSide(){
        return super.getWidth();
    }
}
