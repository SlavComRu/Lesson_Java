package HomeWork;

public abstract class Employees {
    private String name;

    public Employees(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nameEmployees(){
        System.out.println("Имя сотрудника: " + name);
    }
}
