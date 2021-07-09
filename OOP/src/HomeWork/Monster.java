package HomeWork;

public class Monster {
    int eyes;
    int leg;
    int hand;

    public Monster() {
        eyes = 2;
        leg = 2;
        hand = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        leg = 2;
        hand = 2;
    }

    public Monster(int eyes, int leg) {
        this.eyes = eyes;
        this.leg = leg;
        hand = 2;
    }

    public Monster(int eyes, int leg, int hand) {
        this.eyes = eyes;
        this.leg = leg;
        this.hand = hand;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        String voice = "";
        for (int j = 0; j < i; j++) {
            voice += "Голос ";
        }
        System.out.println(voice);
    }

    void voice(int i, String word) {
String st = " ";
        for (int j = 0; j < i; j++) {
            st +=word + " ";
        }
        System.out.println(st);
    }
}
