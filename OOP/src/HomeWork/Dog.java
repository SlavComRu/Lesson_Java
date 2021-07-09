package HomeWork;

public class Dog {
    String nickname;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed ; i++) {
            result += "Бегу";
            if (i == speed-1){
                result += ".";
            }else result +=", ";

        }
        System.out.println(result);
    }
    String info(){
        return "Собаку зовут " +nickname + ",её порода " + breed +
                " и скорость " +speed + " км/ч";
    }
}
