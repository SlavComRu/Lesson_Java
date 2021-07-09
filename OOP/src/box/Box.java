package box;

public class Box {
    private double width; //ширина
    private double height; // высота
    private double length; // длина

    public Box(){
        width = 0;
        height = 0;
        length = 0;
    }


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        this.width = size;
        this.height = size;
        this.length = size;

    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public Box(Box box, Box box1) {
        this.width = box.width + box1.width;
        this.height = box.height + box1.height;
        this.length = box.length + box1.length;
    }

    public void showInfo(){
        System.out.println("Ширина: " + width + "\nВысота: " + height + "\nДлина: " + length);
    }
    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    public double Volume() {
        return width + height + length;
    }

    public void showVolume() {
        System.out.println(Volume());
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int compare(Box box) {
        double thisVolume = Volume();
        double boxVolume = box.Volume();
        if (thisVolume > boxVolume)
            return 1;
        else if (thisVolume < boxVolume)
            return -1;
        else return 0;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        String result = String.format("Ширина: %s\nДлина: %s\nШирина:%s",width,length,height);// "Ширина: " + width + "\nДлина: " + length + "\nВысота: "+ height;
        return result;
    }
}
