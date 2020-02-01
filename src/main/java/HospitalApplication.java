public class HospitalApplication {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Mack", 101, 90000, "Foot");
        System.out.println(ANSI_PURPLE + doctor + ANSI_RESET);
        Doctor doctorTwo = new Doctor("Grace", 102, 90000, "Brain");
        System.out.println(ANSI_PURPLE + doctorTwo + ANSI_RESET);
        Doctor doctorThree = new Doctor("Jon", 103, 90000, "Family");
        System.out.println(ANSI_PURPLE + doctorThree + ANSI_RESET);

        Nurse nurse = new Nurse("Jess", 201, 50000);
        System.out.println(ANSI_RED + nurse + ANSI_RESET);

        Employee receptionist = new Receptionist("Pam", 301, 450000);
        System.out.println(ANSI_BLUE + receptionist + ANSI_RESET);

        Employee janitor = new Janitor("Juan", 401, 40000);
        System.out.println(ANSI_CYAN + janitor + ANSI_RESET);

        Patient patient = new Patient("Bob", 20, 10);
        System.out.println(ANSI_YELLOW + patient + ANSI_RESET);


    }
}
