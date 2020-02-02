//Default BLOOD_LEVEL 20
//Default HEALTH_LEVEL 10
//Heart, Brain, leftFoot, rightFoot, leftArm, rightArm,


public class Patient {
    protected int bloodLevel = 20;
    protected int healthLevel = 10;
    protected String name;

    public Patient(String name, int bloodLevel, int healthLevel) {
        this.name = name;
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public void tick() {
        healthLevel--;
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

    public void giveBlood(int amountDrawn) {
        bloodLevel -= amountDrawn;
    }

    public void gainHealth() {
            healthLevel ++;
            if(healthLevel >= 10);
            this.healthLevel = 10;
    }
    public void gainBlood(){
        bloodLevel += 5;
        if(bloodLevel >= 20);
        this.bloodLevel = 20;
    }



    @Override
    public String toString() {
        return "[Patient: " + name + " | Blood Level: " + bloodLevel + " | Health Level: " + healthLevel + "]";
    }
}


