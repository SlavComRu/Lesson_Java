package HomeWork;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        director.force(accountant,6);
        director.force(new Counter() {
            @Override
            public String report(int month) {
                return "Отчет за " + month + " месяцев";
            }
        },2);
    }
}
