package HomeWork;

public class Cook extends Employees implements Cooking{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void toCook() {
        System.out.println("Умеет готовить");
    }
}
