public class Cat extends CatFamily {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        System.out.println("Кушаю вискас");
    }



}
