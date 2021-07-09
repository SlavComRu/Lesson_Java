package box;

public class BoxWeight extends Box {

   private double weight; //вес

   public BoxWeight(){

       super();
        weight = 0;
    }
    public BoxWeight(double wight, double height, double length, double weight){
       super(wight, height, length);
       this.weight = weight;
    }

    public BoxWeight(double size){
       super(size);
       this.weight = size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }

    public double getWeight() {
        return weight;
    }
}
