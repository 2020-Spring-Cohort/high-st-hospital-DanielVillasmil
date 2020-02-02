//Gets paid $50.000
//extends employee
//Can draw blood and care for patient

public class Nurse extends Employee implements MedicalStaff {

    public Nurse(String name, int id, int salary, boolean Paid) {
        super(name, id, salary, Paid);

    }

    @Override
    public void drawBlood(Patient patient) {
        patient.giveBlood(3);

    }

    @Override
    public void treatPatient(Patient patient) {
        patient.gainHealth();
    }

    @Override
    public String toString() {
        return "[Nurse: " + getName() + " | ID :" + getId() + " | Salary: " + getSalary() + " | Paid: " + getPaid() + "]";
    }
}

