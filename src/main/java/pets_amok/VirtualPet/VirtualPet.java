package pets_amok.VirtualPet;

public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int health;
    private int happiness;

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public VirtualPet(String petName, String petDescription, int health, int happiness) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.health = health;
        this.happiness = happiness;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
