import java.sql.SQLOutput;

public class HospitalApplication {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private static Employee doctor = new Doctor("Mack", 101, 90000, "Foot", false);
    private static Patient patient = new Patient("Bob", 20, 10);
    private static Employee nurse = new Nurse("Jess", 201, 50000, false);


    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "              +----------------------------------------+" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "              |    Welcome to the High St. Hospital    |" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "              |             HOSPITAL STAFF             |" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "              +--------------------------------------- +" + ANSI_RESET + "\n");
        medicalStaffStatus();
        System.out.println(ANSI_YELLOW + "               +----------------------------------------+" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "               |               PATIENTS                 |" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "               +----------------------------------------+" + ANSI_RESET);
        patientStatus();
        System.out.println("Oh no!! Bob has coronavirus!! Call Doctor Mack!" + "\n");
        System.out.println(ANSI_GREEN + "               ***Bob is taken to containment***" + ANSI_RESET);
        getBloodTaken(nurse, patient);

        tickAll();

        patientStatusSick();

        increaseHealth(doctor, patient);

        patientStatusGood();


        System.out.println("Good job! all of you contributed to the cure of coronavirus! Here is your pay." + "\n");

        medicalStaffPaid();

    }

    private static void tickAll() {
        patient.tick();
    }

    public static void increaseHealth(Employee name, Patient patientName) {
        System.out.println("Doctor Mack is treating Bob with vaccine." + "\n");
        ((Doctor) name).treatPatient(patientName);
    }


    public static void getBloodTaken(Employee name, Patient patientName) {
        System.out.println("Nurse Jess is drawing blood from Bob for research." + "\n");
        ((Nurse) name).drawBlood(patientName);
    }

    public static void increaseBlood(Employee name, Patient patientName) {
        System.out.println("Bob has gain some blood.");
        patientStatus();
    }


    public static void patientStatus() {
        System.out.println(ANSI_YELLOW + patient + ANSI_RESET + "\n");

    }

    public static void patientStatusSick() {
        System.out.println(ANSI_YELLOW + patient + ANSI_RESET + "\n");

    }

    public static void patientStatusGood() {
        System.out.println(ANSI_YELLOW + patient + ANSI_RESET + "\n");
    }


    public static void medicalStaffPaid() {
        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot", true);
        doctor.receivePay();
        System.out.println(ANSI_PURPLE + doctor + ANSI_RESET);

        Doctor doctorTwo = new Doctor("Grace", 102, 90000, "Brain", true);
        doctorTwo.receivePay();
        System.out.println(ANSI_PURPLE + doctorTwo + ANSI_RESET);

        Doctor doctorThree = new Doctor("Jon", 103, 90000, "Family", true);
        doctorThree.receivePay();
        System.out.println(ANSI_PURPLE + doctorThree + ANSI_RESET);

        Nurse nurse = new Nurse("Jess", 201, 50000, true);
        nurse.receivePay();
        System.out.println(ANSI_RED + nurse + ANSI_RESET);

        Employee receptionist = new Receptionist("Pam", 301, 450000, false, true);
        receptionist.receivePay();
        System.out.println(ANSI_BLUE + receptionist + ANSI_RESET);

        Employee janitor = new Janitor("Juan", 401, 40000, true, true);
        janitor.receivePay();
        System.out.println(ANSI_CYAN + janitor + ANSI_RESET);
    }

    public static void medicalStaffStatus() {
        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot", false);
        System.out.println(ANSI_PURPLE + doctor + ANSI_RESET);
        Doctor doctorTwo = new Doctor("Grace", 102, 90000, "Brain", false);
        System.out.println(ANSI_PURPLE + doctorTwo + ANSI_RESET);
        Doctor doctorThree = new Doctor("Jon", 103, 90000, "Family", false);
        System.out.println(ANSI_PURPLE + doctorThree + ANSI_RESET);

        Nurse nurse = new Nurse("Jess", 201, 50000, false);
        System.out.println(ANSI_RED + nurse + ANSI_RESET);

        Employee receptionist = new Receptionist("Pam", 301, 450000, true, false);
        System.out.println(ANSI_BLUE + receptionist + ANSI_RESET);

        Employee janitor = new Janitor("Juan", 401, 40000, true, false);
        System.out.println(ANSI_CYAN + janitor + ANSI_RESET);
    }

}
