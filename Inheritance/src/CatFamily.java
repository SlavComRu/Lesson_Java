public class CatFamily {
    private int ears; //уши
    private int lens; // ноги
    private boolean bigClaws;  // большие когти


    public CatFamily(int ears, int lens, boolean bigClaws) {
        this.ears = ears;
        this.lens = lens;
        this.bigClaws = bigClaws;
    }

    public void showInfo(){
        System.out.println("Количество ушей: " + ears + " Количество лап: " + lens + " Наличие больший коктей: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat(){
        System.out.println( "Кушаю еду");
    }
}
