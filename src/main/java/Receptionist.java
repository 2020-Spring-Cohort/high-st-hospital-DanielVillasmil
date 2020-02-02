//gets paid $45.000
//extends employee


public class Receptionist extends Employee {

    public Receptionist(String name, int id, int salary, boolean onPhone, boolean Paid) {
        super(name, id, salary, Paid);
        this.answeringPhone = onPhone;

    }

    private boolean answeringPhone;

    public boolean isAnsweringPhone() {
        return answeringPhone;
    }

    public void toggleAnsweringPhone() {
        answeringPhone = !answeringPhone;

    }

    @Override
    public String toString() {
        return "[Receptionist: " + getName() + " | ID: " + getId() + " | Salary: " + getSalary() + " | On the phone: " + isAnsweringPhone() + " | Paid: " + getPaid() + "]";
    }
}
