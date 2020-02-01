//Gets paid $40.000
//extends employee


public class Janitor extends Employee {

    private boolean sweeping;

    public Janitor(String name, int id, int salary) {
        super(name, id, salary);
        this.sweeping = false;

    }

    public boolean isSweeping() {
        return sweeping;
    }

    public void toggleSweeping() {
        sweeping = !sweeping;

    }

    @Override
    public String toString() {
        return "[Janitor: " + getName() + ", ID: " + getId() + ", Salary: " + getSalary() + ", Sweeping: " + sweeping + "]";
    }
}
