package HomeWork;

public class Accountant implements Counter{
    @Override
    public String report(int month) {
        return "Отчет за " + month + " месяцев";
    }
}
