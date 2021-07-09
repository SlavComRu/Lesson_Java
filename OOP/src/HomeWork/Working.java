package HomeWork;

public class Working {
    String name;
    String position;
    int salary;

    public Working(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int i) {
        return "Сотрудний: " + name + "\nДолжность: " + position +
                "\nЗаработная плата за " + i
                + " месяцев составляет " + i * salary + " рублей";
    }
}
