public class HospitalApplication {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED + "                      HOSPITAL STAFF" + ANSI_RESET);

        medicalStaffStatus();

        System.out.println(ANSI_YELLOW + "                        PATIENTS" + ANSI_RESET);

        patientStatus();


        medicalStaffPaid();
    }

    private static void patientStatus() {
        Patient patient = new Patient("Bob", 20, 10);
        System.out.println(ANSI_YELLOW + patient + ANSI_RESET);
    }

    private static void medicalStaffPaid() {
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

        Employee receptionist = new Receptionist("Pam", 301, 450000, true);
        receptionist.receivePay();
        System.out.println(ANSI_BLUE + receptionist + ANSI_RESET);


        Employee janitor = new Janitor("Juan", 401, 40000, true);
        janitor.receivePay();
        System.out.println(ANSI_CYAN + janitor + ANSI_RESET);
    }

    private static void medicalStaffStatus() {
        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot", false);
        System.out.println(ANSI_PURPLE + doctor + ANSI_RESET);
        Doctor doctorTwo = new Doctor("Grace", 102, 90000, "Brain", false);
        System.out.println(ANSI_PURPLE + doctorTwo + ANSI_RESET);
        Doctor doctorThree = new Doctor("Jon", 103, 90000, "Family", false);
        System.out.println(ANSI_PURPLE + doctorThree + ANSI_RESET);

        Nurse nurse = new Nurse("Jess", 201, 50000, false);
        System.out.println(ANSI_RED + nurse + ANSI_RESET);

        Employee receptionist = new Receptionist("Pam", 301, 450000, false);
        System.out.println(ANSI_BLUE + receptionist + ANSI_RESET);

        Employee janitor = new Janitor("Juan", 401, 40000, false);
        System.out.println(ANSI_CYAN + janitor + ANSI_RESET);
    }

}
