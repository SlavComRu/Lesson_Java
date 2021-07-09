public class Seconds {
    public static void main(String[] args) {
        int seconds =524698;
        int days = seconds / 86400;
        int hour = seconds % 86400 / 3600;
        int minutes = seconds % 3600 / 60;
        int leftSeconds = seconds % 60;

        System.out.println("Всего секунд: "+ seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hour);
        System.out.println("Минуты: " + minutes);
        System.out.println("Секунд: " + leftSeconds);

    }
}
