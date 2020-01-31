//Gets paid $90.000
//extends employee
//Can draw blood and care for patient

public class Doctor<specialty> extends Employee implements specialty {


    public Doctor(String name, int id, int salary, String specialty) {
        super("Mack", 101, 90000, "familu");
    }

    @Override{
        public void specialty(String){
            Doctor + specialty;
        }

    }
    public void drawBlood(Patient patient) {
    }
}
