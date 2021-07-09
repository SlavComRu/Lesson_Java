package HomeWork;

public class Programmer extends Employees implements To_program {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void toProgram() {
        System.out.println("Умеет писать код");
    }
}
