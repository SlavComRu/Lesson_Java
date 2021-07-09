package man;

public class Main {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см." +
                " Должность программист.";

        String name = s.substring(4,8);
        String position = s.substring(52,63);
        int age =Integer.parseInt(s.substring(14,16));
        double height = Double.parseDouble(s.substring(32,37));

        Man man = new Man(name,position,age,height);

        System.out.println("Имя: " +man.getName());
        System.out.println("Должность: " +man.getPosition());
        System.out.println("Возраст: " +man.getAge());
        System.out.println("Рост:   " +man.getHeight());


    }

}
