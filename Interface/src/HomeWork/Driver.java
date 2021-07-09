package HomeWork;

public class Driver extends Employees implements To_drive {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void toDrive() {
        System.out.println("Умеет водить автомобиль");
    }
}
