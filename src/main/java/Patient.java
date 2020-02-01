//Default BLOOD_LEVEL 20
//Default HEALTH_LEVEL 10
//Heart, Brain, leftFoot, rightFoot, leftArm, rightArm,


public class Patient {
    private int bloodLevel = 20;
    private int healthLevel = 10;
    private String name;

    public Patient(String name, int bloodLevel, int healthLevel) {
        this.name = name;
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void drawBlood(int amountDrawn) {
        bloodLevel -= amountDrawn;
    }

    public void treatPatient(int increasedHealth) {
        healthLevel += increasedHealth;
    }

    @Override
    public String toString() {
        return "[Patient: " + name + ", bloodLevel: " + bloodLevel + ", healthLevel: " + healthLevel + "]";
    }
}


