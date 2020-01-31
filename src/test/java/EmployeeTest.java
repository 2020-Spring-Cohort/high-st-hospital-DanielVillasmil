import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @Test
    public void doctorOneShouldHaveName() {
        Employee doctor = new Doctor ("Mack", 101,90000, "Family" );
        String result = underTest.getName();
        assertEquals("Mack", result);
    }
    @Test
    public void doctorShouldHaveSalary (){
            int salary = underTest.getSalary();
            assertEquals(90000, salary);
        }
    @Test
    public void employeeShouldKnowIfTheyAreNotPaid(){
        boolean isPaid = underTest.getPaid();
        assertFalse(isPaid);
    }
    @Test
    public void employeeShouldKnowIfTheyArePaid(){
        underTest.receivePay();
        boolean isPaid = underTest.getPaid();
        assertTrue(isPaid);
    }
    @Test
    public void doctorShouldHaveId(){
        int id = underTest.getId();
        assertEquals(100, id);
    }
}