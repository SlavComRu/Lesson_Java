import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();
//        Bird bird = new Bird();
//
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(fish);
//        animals.add(bird);
//
//        for (Animal animal: animals
//             ) {animal.eat();
//
//        }
//       Animal animal = dog;
//
//        dog = (Dog) animal;
//        ((Dog) animal).run();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        ArrayList<CanRun> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);
        animals.add(bird1);

        for (CanRun c: animals
             ) {c.run();

        }

        Dog dog0 = new Dog();
        CanRun canRun= dog0;
       dog0 = (Dog) canRun;
       ((Dog) canRun).eat();

       Flyable flyable = new Bird();
       flyable.fly();

    }
}
