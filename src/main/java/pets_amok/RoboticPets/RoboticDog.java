package pets_amok.RoboticPets;

import pets_amok.Interfaces.RoboticPetInterface;
import pets_amok.VirtualPet.VirtualPet;

public class RoboticDog extends VirtualPet implements RoboticPetInterface {

    private int rust;
    private int charge;

    public int getRust() {
        return rust;
    }

    public int getCharge() {
        return charge;
    }

    public RoboticDog(String petName, String petDescription) {
        this(petName, petDescription, 70, 60, 50, 60);
    }

    public RoboticDog(String petName, String petDescription, int health, int happiness, int rust, int charge) {
        super(petName, petDescription, health, happiness);
        this.rust = rust;
        this.charge = charge;
    }

    public void play() {
        setHappiness(getHappiness() + 5);
        setCharge(getCharge() - 5);
    }

    @Override
    public void oil() {
        setRust(0);
    }

    @Override
    public void chargeBattery() {
        setCharge(100);
    }

    public void setRust(int rust) {
        this.rust = rust;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
}
