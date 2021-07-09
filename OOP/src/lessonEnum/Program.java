package lessonEnum;

public class Program {
    public static void main(String[] args) {
        Day current = Day.FRIDAY;
        System.out.println(current);
        Film film = new Film("Звездные войны", Type_Film.PHANTASY, "Васильев");
        System.out.println("Фильм  : " + film.getName() + "\nтип фильма: " + film.getType()+ "\nпродюссер фильма: " + film.getProducer());
        Type_Film[] type = Type_Film.values();
        for (Type_Film t: type
             ) {
            System.out.println(t.ordinal());
            
        }

    }
}
