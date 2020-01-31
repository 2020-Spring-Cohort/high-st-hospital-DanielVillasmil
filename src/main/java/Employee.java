import java.util.Scanner;

public class Employee {

    private String name;
    private int id;
    private int salary;
    Scanner scanner = new Scanner(System.in);

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

    public boolean getPaid() {

        return false;
    }

    public void receivePay() {
    }
}
