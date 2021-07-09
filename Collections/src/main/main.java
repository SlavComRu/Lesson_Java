package main;


import java.util.*;

public class main {
    public static void main(String[] args) {
//        String[] employees = {"Никита", "Игорь", "Ольга", "Василий", "Максим"};
//
//        String[] second = new String[employees.length + 1];
//
//        for (int i = 0; i < employees.length; i++) {
//            second[i] = employees[i];
//        }
//        second[second.length - 1] = "Иван";
//
//        employees = second;
//        employees[1] = null;
//
//        String[] newName = new String[employees.length - 1];
//        for (int i = 0, j = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                newName[j] = employees[i];
//                j++;
//            }
//        }
//        employees = newName;
//        for (String name : employees
//        ) {
//            System.out.println(name);
//
//
//        employees.remove(0);
//        employees.remove("Петя");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//
//        }
//        MyArrayList myArrayList = new MyArrayList();
//        for (int i = 0; i < 5; i++) {
//            myArrayList.add("name " + i);
//
//        }
//
//
//        MyArrayListTwo employees = new MyArrayListTwo();
//        for (int i = 0; i <= 8; i++) {
//            employees.add("Name " + i);
//
//        }
//
//        employees.remove(2);
//        employees.remove("Name 5");
//        employees.remove( 56);
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }
//        System.out.println(employees.getSize());
//        System.out.println(employees.get(10));

//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("Сергей");
//        employees.add("Валя");
//        employees.add("Коля");
//        employees.add("Вера");
//        employees.add("Макс");
//        employees.add("Петя");
//        employees.remove("Коля");
//        for (String name : employees) {
//            System.out.println(name);
//        }
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add(i);
//
//        }
//        int sum = 0;
//        for (int i : numbers
//        ) {
//            sum +=i;
//
//        }
//        System.out.println(sum);
//        System.out.println("---------------------------");
//
//        TreeSet<String> names = new TreeSet<>();
//        names.add("Валя");
//        names.add("Рома");
//        names.add("Виталик");
//        names.add("Елена");
//        names.add("Толя");
//        names.add("Саша");
//        names.add("Рома");
//        for (String name: names
//             ) {
//            System.out.println(name);
//
//        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);

        }
        ArrayList<String> names = new ArrayList<>();
        names.add("Валя");
        names.add("Рома");
        names.add("Виталик");
        names.add("Елена");
        names.add("Толя");
        names.add("Саша");
        names.add("Рома");
        names.add("Маша");
        names.add("Таня");
        names.add("Дима");


        Map<Integer,String> person = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            person.put(numbers.get(i), names.get(i));
            
        }
        for (Map.Entry<Integer,String> item: person.entrySet())
              {
                  System.out.println(item.getKey() + " - " + item.getValue() );
            
        }
    }
}
