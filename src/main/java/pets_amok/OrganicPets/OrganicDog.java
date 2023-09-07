package pets_amok.OrganicPets;

import pets_amok.Interfaces.OrganicPetInterface;
import pets_amok.VirtualPet.VirtualPet;

public class OrganicDog extends VirtualPet implements OrganicPetInterface {

    private int hunger;
    private int thirst;
    private int boredom;
    private int potty;
    private int cage;

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getPotty() {
        return potty;
    }

    public int getCage() {
        return cage;
    }

    public OrganicDog(String petName, String petDescription) {
        this(petName, petDescription, 70, 70, 50, 50, 50, 50, 0);
    }

    public OrganicDog(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
            int boredom, int potty, int cage) {
        super(petName, petDescription, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.potty = potty;
        this.cage = cage;
    }

    @Override
    public void feed() {
        setHunger(0);
        setThirst(getThirst() + 5);
        setHealth(getHealth() + 5);
    }

    @Override
    public void drink() {
        setThirst(0);
        setHealth(getHealth() + 5);
        setPotty(getPotty() + 5);
    }

    @Override
    public void play() {
        setBoredom(0);
        setHunger(getHunger() + 5);
        setThirst(getThirst() + 5);
        setHealth(getHealth() + 5);
    }

    @Override
    public void usePotty() {
        setPotty(0);
        setBoredom(0);
        setHealth(getHealth() + 10);
    }

    public void cleanTheCage() {
        setCage(0);
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setPotty(int potty) {
        this.potty = potty;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }
}
