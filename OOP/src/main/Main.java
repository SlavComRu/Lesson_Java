package main;

import box.Box;
import test.MyMath;
import test.Test;
import test.Man;


class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.square(9));

        Box box1 = new box.Box(10, 15, 15);
        box1.Volume();



        int result = Test.multiple(15, 40);
        int result1 = Test.multiple(6, 4);
        int result2 = (int) Math.random();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        Box box2 = new Box(5);
        Box box3 = box2.increase(2);
        Box box4 = new Box(box2, box3);

        box2.showVolume();
        box3.showVolume();
        box4.showVolume();
        int i = box4.compare(box1);
        System.out.println(i);


        Man man = new Man("Slava", 35);
        man.setAge(110);
        man.showInfo();
        System.out.println(man.getAge());

        int myMath = MyMath.square(50);
        System.out.println(myMath);
        double length = MyMath.length(12);
        System.out.println(length);
        double radius = MyMath.area(3);
        System.out.println(radius);
        length = MyMath.length(15);
        System.out.println(length);
        int sum = MyMath.sum(1,4,6);
        System.out.println(sum);
    }
}
