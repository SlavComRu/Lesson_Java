package HomeWork;

public class Rest {
    double length;
    double width;

    void setDimens(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeterOfTheRectangle() { // периметр прямоугольника
        return 2 * (length + width);

    }

    double areaOfTheRectangle() { // площадь прямоугольника
        return length * width;
    }
}
