package figure;

public class Rect extends Figure {
    Rect(double a, double b) {
        super(a, b);
    }

    Rect(double size) {
        super(size, size);
    }


    @Override
    public double area() {
        return getB() * getB();
    }
}
