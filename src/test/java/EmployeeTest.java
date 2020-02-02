//import Hospital.Hospital;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;
    private Employee mack;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void employeeShouldHaveName() {
        Employee name = new Employee("Mack", 101, 0, false);
        String result = name.getName();
        assertEquals("Mack", result);
    }

    @Test
    public void employeeShouldHaveSalary() {
        Employee salary = new Employee("Mack", 101, 0, false);
        int result = salary.getSalary();
        assertEquals(0, result);
    }

    @Test
    public void employeeShouldHaveId() {
        Employee id = new Employee("Mack", 101, 0, false);
        int result = id.getId();
        assertEquals(101, result);
    }

    @Test
    public void doctorShouldHaveSpecialty() {
        Doctor specialty = new Doctor("Mack", 101, 0, "Foot", false);
        String result = specialty.getSpecialty();
        assertEquals("Foot", result);
    }

    @Test
    public void employeeShouldKnowIfTheyAreNotPaid() {
        Employee employee = new Employee("Steve", 300, 40000, false);
        boolean isPaid = employee.getPaid();
        assertFalse(isPaid);
    }

    @Test
    public void employeeShouldKnowIfTheyArePaid() {
        Employee employee = new Employee("Steve", 300, 40000, false);
        boolean isPaid = employee.receivePay();
        assertTrue(isPaid);
    }

    @Test
    public void shouldNotBeSweeping() {
        Janitor underTest = new Janitor("", 401, 40000, false, false);
        boolean isSweeping = underTest.isSweeping();
        assertFalse(isSweeping);
    }

    @Test
    public void shouldBeSweeping() {
        Janitor underTest = new Janitor("", 401, 40000, false, false);
        underTest.toggleSweeping();
        boolean isSweeping = underTest.isSweeping();
        assertTrue(isSweeping);
    }

    @Test
    public void receptionistIsNotOnThePhone() {
        Receptionist underTest = new Receptionist("", 301, 450000, false, true);
        boolean isAnsweringPhone = underTest.isAnsweringPhone();
        assertFalse(isAnsweringPhone);
    }

    @Test
    public void receptionistIsOnThePhone() {
        Receptionist underTest = new Receptionist("", 301, 450000, false, true);
        underTest.toggleAnsweringPhone();
        boolean isAnsweringPhone = underTest.isAnsweringPhone();
        assertTrue(isAnsweringPhone);
    }

    @Test
    public void medicalStaffShouldDrawBlood() {
        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot", false);
        Patient patient = new Patient("", 20, 10);
        doctor.drawBlood(patient);
        assertEquals(17, patient.getBloodLevel());
    }

    @Test
    public void medicalStaffShouldTreatPatient() {
        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot", false);
        Patient patient = new Patient("", 20, 10);
        doctor.treatPatient(patient);
        assertEquals(10, patient.getHealthLevel());
    }

    @Test
    public void patientShouldHaveName() {
        Patient patient = new Patient("", 20, 10);
        String result = patient.getName();
        assertEquals("", result);
    }

    @Test
    public void patientShouldHaveHealth10() {
        Patient patient = new Patient("", 20, 10);
        int result = patient.getHealthLevel();
        assertEquals(10, result);
    }

    @Test
    public void patientShouldHaveBlood20() {
        Patient patient = new Patient("", 20, 10);
        int result = patient.getBloodLevel();
        assertEquals(20, result);
    }

    @Test
    public void tickShouldDecreaseHealth() {
        Patient patient = new Patient("", 20, 10);
        patient.tick();
        int result = patient.healthLevel;
        assertEquals(9, result);
    }


}