package box;

import test.Empty;

public class main {
    public static void main(String[] args) {
        Box box = new Box(13,45,6);
//        BoxWeight boxWeight = new BoxWeight(40);
//        boxWeight.showInfo();
//        System.out.println("-------------------");
//        box.showInfo();
//
//        System.out.println(boxWeight.getHeight());
//        System.out.println(boxWeight.getWeight());
        Empty empty = new Empty();
        System.out.println(box);
        double s = Math.random();
        s*=6;
        int randomInt = (int)s;
        int result = (int)(Math.random() * 6 +1);
        System.out.println(result);
        Box box1 = new Box(s);
        System.out.println(box1);

        int random = (int)(Math.random()*100);
        String s1 = String.format("Случайное число ... %s\nПопробуйте ещё снова",random);
        if (random>10)
            System.out.println(s1);

    }
}
