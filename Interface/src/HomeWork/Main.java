package HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Слава");
        Programmer programmer2 = new Programmer("петя");
        Programmer programmer3 = new Programmer("Зоя");
        Cook cook1 = new Cook("Елена");
        Cook cook2 = new Cook("Рома");
        Cook cook3 = new Cook("Коля");
        Driver driver1 = new Driver("Макс");
        Driver driver2 = new Driver("Даша");
        Driver driver3 = new Driver("Дима");


        ArrayList<Employees> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);

        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);



        for (Employees e: employees
             ) {e.nameEmployees();

        }

        ArrayList<To_program> to_programs = new ArrayList<>();
        to_programs.add(programmer1);
        to_programs.add(programmer2);
        to_programs.add(programmer3);

        for (To_program pr: to_programs
             ) { pr.toProgram();

        }
    }
}
