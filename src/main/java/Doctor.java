//Gets paid $90.000
//extends employee
//Can draw blood and care for patient

public class Doctor extends Employee implements MedicalStaff {

    private String specialty;

    public Doctor(String name, int id, int salary, String specialty) {
        super(name, id, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void drawBlood(Patient patient) {
        patient.drawBlood(3);

    }

    @Override
    public void treatPatient(Patient patient) {
        patient.treatPatient(5);
    }

    @Override
    public String toString() {
        return "[Doctor: " + getName() + ", ID: " + getId() + ", Salary: " + getSalary() + ", Specialty: (" + getSpecialty() + ")]";
    }
}




