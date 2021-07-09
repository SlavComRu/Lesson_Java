public class Food {
    public static void main(String[] args) {
        int cash = 500;
        if (cash >= 500)
            System.out.println("Покупаем пиццу");
        else if (cash >= 400)
            System.out.println("Покупаем шаверму");
        else if (cash > 100)
            System.out.println("Покупаем гамбургер");

        else System.out.println("Покупаем дошик");

        int days = 1000;
        int seconds = days * 24 * 3600;
        int speed = 300000;
        long distance = (long) seconds * speed;
        System.out.println(distance);
    }


}
