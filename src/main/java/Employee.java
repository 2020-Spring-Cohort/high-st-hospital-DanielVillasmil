public class Employee {

    private String name;
    protected int id;
    protected int salary;
    private boolean isPaid = false;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getPaid() {
        return isPaid;
    }

    public boolean receivePay() {
        return isPaid = true;
    }
}
