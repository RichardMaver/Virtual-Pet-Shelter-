package pets_amok.VirtualPetShelter;

import java.util.HashMap;
import java.util.Map;

import pets_amok.OrganicPets.OrganicDog;
import pets_amok.OrganicPets.OrganicCat;
import pets_amok.RoboticPets.RoboticCat;
import pets_amok.RoboticPets.RoboticDog;
import pets_amok.VirtualPet.VirtualPet;

public class VirtualPetShelter {
    int organicDogCount;
    int organicCatCount;
    int roboticDogCount;
    int roboticCatCount;

    public Map<Integer, OrganicDog> listOfOrganicDogs = new HashMap<>();
    public Map<Integer, OrganicCat> listOfOrganicCats = new HashMap<>();
    public Map<Integer, RoboticDog> listOfRoboticDogs = new HashMap<>();
    public Map<Integer, RoboticCat> listOfRoboticCats = new HashMap<>();

    public VirtualPet getOrganicDogId(Integer petId) {
        return listOfOrganicDogs.get(petId);
    }

    public VirtualPet getOrganicCatId(Integer petId) {
        return listOfOrganicCats.get(petId);
    }

    public VirtualPet getRoboticDogId(Integer petId) {
        return listOfRoboticDogs.get(petId);
    }

    public VirtualPet getRoboticCatId(Integer petId) {
        return listOfRoboticCats.get(petId);
    }

    public VirtualPetShelter() {
        listOfOrganicDogs.put(0, new OrganicDog("Spot", "Small but agile, loves to run", 100, 100, 20, 20, 20, 20, 0));
        listOfOrganicDogs.put(1, new OrganicDog("Rusty", "Big Fluffy Dog that loves to lay in the sun", 100, 100, 20, 20, 20, 20, 0));
        listOfOrganicCats.put(0, new OrganicCat("French Toast", "Brown and while swirled fur cat that sleeps a lot",
                100, 100, 20, 20, 20, 20, 0));
        listOfOrganicCats.put(1, new OrganicCat("Ketchup", "Nothing going on behind their eyes",
                100, 100, 20, 20, 20, 20, 0));
        listOfRoboticDogs.put(0,
                new RoboticDog("Sparky", "Shiny silver pup that will follow you wherever you go", 100, 100, 20, 80));
        listOfRoboticDogs.put(1,
                new RoboticDog("Bolt", "Shockingly fast", 100, 100, 20, 80));
        listOfRoboticCats.put(0, new RoboticCat("Raisin",
                "Shiny purple RoboKitty that will ignore you and do what it wants", 100, 100, 20, 80));
        organicDogCount = listOfOrganicDogs.size();
        listOfRoboticCats.put(1, new RoboticCat("Kit-Kat",
                "Slightly malfunctioning RoboKitty with two personalities", 100, 100, 20, 80));
        organicDogCount = listOfOrganicDogs.size();
        organicCatCount = listOfOrganicCats.size();
        roboticDogCount = listOfOrganicDogs.size();
        roboticCatCount = listOfOrganicCats.size();
    }

    public void showListOfPets() {
        System.out.println("List of Organic Dogs:");
        for (Map.Entry<Integer, OrganicDog> organicDog : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = organicDog.getValue();
            System.out.println("\t" + dog.getPetName() + ", Hunger: " + dog.getHunger() + ", Thirst: " + dog.getThirst()
                    + ", Boredom: " + dog.getBoredom() + ", Potty: " + dog.getPotty() + ", Health: " + dog.getHealth()
                    + ", Happiness: " + dog.getHappiness() + ", Cage Soil Level: " + dog.getCage());
        }
        System.out.println("\nList of Organic Cats:");
        for (Map.Entry<Integer, OrganicCat> organicCat : listOfOrganicCats.entrySet()) {
            OrganicCat cat = organicCat.getValue();
            System.out.println("\t" + cat.getPetName() + ", Hunger: " + cat.getHunger()
                    + ", Thirst: " + cat.getThirst() + ", Boredom: " + cat.getBoredom() + ", Potty: " + cat.getPotty()
                    + ", Health: " + cat.getHealth() + ", Happiness: " + cat.getHappiness());
        }
        System.out.println("\nList of Robotic Dogs:");
        for (Map.Entry<Integer, RoboticDog> roboticDog : listOfRoboticDogs.entrySet()) {
            RoboticDog roboDog = roboticDog.getValue();
            System.out.println(
                    "\t" + roboDog.getPetName() + ", Rust: " + roboDog.getRust() + ", Charge: " + roboDog.getCharge()
                            + ", Maintenance: " + roboDog.getHealth() + ", Happiness: " + roboDog.getHappiness());
        }
        System.out.println("\nList of Robotic Cats:");
        for (Map.Entry<Integer, RoboticCat> roboticCat : listOfRoboticCats.entrySet()) {
            RoboticCat roboCat = roboticCat.getValue();
            System.out.println(
                    "\t" + roboCat.getPetName() + ", Rust: " + roboCat.getRust() + ", Charge: " + roboCat.getCharge()
                            + ", Maintenance: " + roboCat.getHealth() + ", Happiness: " + roboCat.getHappiness());
        }
        Map.Entry<Integer, OrganicCat> organicCat = listOfOrganicCats.entrySet().iterator().next();
        OrganicCat cat = organicCat.getValue();
        System.out.println("\tLitter Box Soil Level for all the Organic Cats: " + cat.getLitterBox());
    }

    public void addOrganicDog(OrganicDog organicDog) {
        listOfOrganicDogs.put(organicDogCount++, organicDog);
    }

    public void addOrganicCat(OrganicCat organicCat) {
        listOfOrganicCats.put(organicCatCount++, organicCat);
    }

    public void addRoboticDog(RoboticDog roboticDog) {
        listOfRoboticDogs.put(roboticDogCount++, roboticDog);
    }

    public void addRoboticCat(RoboticCat robotCat) {
        listOfRoboticCats.put(roboticCatCount++, robotCat);
    }

    public void removeOrganicDog(int organicDogId) {
        listOfOrganicDogs.remove(organicDogId);
    }

    public void removeOrganicCat(int organicCatId) {
        listOfOrganicCats.remove(organicCatId);
    }

    public void removeRoboticDog(int roboticDogId) {
        listOfRoboticDogs.remove(roboticDogId);
    }

    public void removeRoboticCat(int roboticCatId) {
        listOfRoboticCats.remove(roboticCatId);
    }

    public void tick() {
        for (Map.Entry<Integer, OrganicDog> organicDog : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = organicDog.getValue();
            dog.setHunger(dog.getHunger() + 2);
            dog.setThirst(dog.getThirst() + 2);
            dog.setBoredom(dog.getBoredom() + 2);
            dog.setPotty(dog.getPotty() + 2);
        }
        for (Map.Entry<Integer, OrganicCat> organicCat : listOfOrganicCats.entrySet()) {
            OrganicCat cat = organicCat.getValue();
            cat.setHunger(cat.getHunger() + 2);
            cat.setThirst(cat.getThirst() + 2);
            cat.setBoredom(cat.getBoredom() + 2);
            cat.setPotty(cat.getPotty() + 2);
        }
        for (Map.Entry<Integer, RoboticDog> roboticDog : listOfRoboticDogs.entrySet()) {
            RoboticDog roboDog = roboticDog.getValue();
            roboDog.setRust(roboDog.getRust() + 2);
            roboDog.setCharge(roboDog.getCharge() - 2);
        }
        for (Map.Entry<Integer, RoboticCat> roboticCat : listOfRoboticCats.entrySet()) {
            RoboticCat roboCat = roboticCat.getValue();
            roboCat.setRust(roboCat.getRust() + 2);
            roboCat.setCharge(roboCat.getCharge() - 2);
        }
        dogStatusLimits();
        catStatusLimits();
        roboticDogStatusLimits();
        roboticCatStatusLimits();
    }

    public void dogStatusLimits() {
        for (Map.Entry<Integer, OrganicDog> organicDog : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = organicDog.getValue();
            if (dog.getHunger() > 100) {
                dog.setHunger(100);
            } else if (dog.getHunger() < 0) {
                dog.setHunger(0);
            }
            if (dog.getHunger() > 85) {
                dog.setHealth(dog.getHealth() - 10);
            }
            if (dog.getThirst() > 100) {
                dog.setThirst(100);
            } else if (dog.getThirst() < 0) {
                dog.setThirst(0);
            }
            if (dog.getThirst() > 85) {
                dog.setHealth(dog.getHealth() - 10);
            }
            if (dog.getBoredom() > 100) {
                dog.setBoredom(100);
            } else if (dog.getBoredom() < 0) {
                dog.setBoredom(0);
            }
            if (dog.getPotty() > 100) {
                dog.setPotty(100);
            } else if (dog.getPotty() < 0) {
                dog.setPotty(0);
            }
            if (dog.getPotty() > 85) {
                dog.setPotty(dog.getPotty() - 25);
                dog.setCage(dog.getCage() + 25);
            }
            if (dog.getCage() > 100) {
                dog.setCage(100);
            } else if (dog.getCage() < 0) {
                dog.setCage(0);
            }
            if (dog.getCage() >= 25) {
                dog.setHealth(dog.getHealth() - 10);
            }
            if (dog.getHealth() > 100) {
                dog.setHealth(100);
            } else if (dog.getHealth() < 0) {
                dog.setHealth(0);
            }
            if (dog.getHealth() > 80) {
                dog.setHappiness(dog.getHappiness() + 10);
            } else if (dog.getHealth() < 80) {
                dog.setHappiness(dog.getHappiness() - 10);
            }
            if (dog.getHappiness() > 100) {
                dog.setHappiness(100);
            } else if (dog.getHappiness() < 0) {
                dog.setHappiness(0);
            }
        }
    }

    public void catStatusLimits() {
        for (Map.Entry<Integer, OrganicCat> organicCat : listOfOrganicCats.entrySet()) {
            OrganicCat cat = organicCat.getValue();
            if (cat.getHunger() > 100) {
                cat.setHunger(100);
            } else if (cat.getHunger() < 0) {
                cat.setHunger(0);
            }
            if (cat.getHunger() > 85) {
                cat.setHealth(cat.getHealth() - 10);
            }
            if (cat.getThirst() > 100) {
                cat.setThirst(100);
            } else if (cat.getThirst() < 0) {
                cat.setThirst(0);
            }
            if (cat.getThirst() > 85) {
                cat.setHealth(cat.getHealth() - 10);
            }
            if (cat.getBoredom() > 100) {
                cat.setBoredom(100);
            } else if (cat.getBoredom() < 0) {
                cat.setBoredom(0);
            }
            if (cat.getPotty() > 100) {
                cat.setPotty(100);
            } else if (cat.getPotty() < 0) {
                cat.setPotty(0);
            }
            if (cat.getPotty() > 85) {
                cat.setPotty(cat.getPotty() - 25);
                cat.setLitterBox(cat.getLitterBox() + 25);
            }
            if (cat.getLitterBox() > 100) {
                cat.setLitterBox(100);
            } else if (cat.getLitterBox() > 0) {
                cat.setLitterBox(0);
            }
            if (cat.getLitterBox() >= 25) {
                cat.setHealth(cat.getHealth() - 10);
            }
            if (cat.getHealth() > 100) {
                cat.setHealth(100);
            } else if (cat.getHealth() < 0) {
                cat.setHealth(0);
            }
            if (cat.getHealth() > 80) {
                cat.setHappiness(cat.getHappiness() + 10);
            } else if (cat.getHealth() < 80) {
                cat.setHappiness(cat.getHappiness() - 10);
            }
            if (cat.getHappiness() > 100) {
                cat.setHappiness(100);
            } else if (cat.getHappiness() < 0) {
                cat.setHappiness(0);
            }
        }
    }

    public void roboticDogStatusLimits() {
        for (Map.Entry<Integer, RoboticDog> roboticDog : listOfRoboticDogs.entrySet()) {
            RoboticDog roboDog = roboticDog.getValue();
            if (roboDog.getRust() >= 100) {
                roboDog.setRust(100);
            } else if (roboDog.getRust() <= 0) {
                roboDog.setRust(0);
            }
            if (roboDog.getRust() >= 45) {
                roboDog.setHealth(roboDog.getHealth() - 10);
            } else if (roboDog.getRust() <= 20) {
                roboDog.setHealth(roboDog.getHealth() + 10);
            }
            if (roboDog.getCharge() >= 100) {
                roboDog.setCharge(100);
            } else if (roboDog.getCharge() <= 0) {
                roboDog.setCharge(0);
            }
            if (roboDog.getHealth() > 100) {
                roboDog.setHealth(100);
            } else if (roboDog.getHealth() < 0) {
                roboDog.setHealth(0);
            }
            if (roboDog.getHealth() <= 70) {
                roboDog.setHappiness(roboDog.getHappiness() - 10);
            } else if (roboDog.getHealth() >= 80) {
                roboDog.setHappiness(roboDog.getHappiness() + 10);
            }
            if (roboDog.getHappiness() >= 100) {
                roboDog.setHappiness(100);
            } else if (roboDog.getHappiness() <= 0) {
                roboDog.setHappiness(0);
            }
        }
    }

    public void roboticCatStatusLimits() {
        for (Map.Entry<Integer, RoboticCat> roboticCat : listOfRoboticCats.entrySet()) {
            RoboticCat roboCat = roboticCat.getValue();
            if (roboCat.getRust() >= 100) {
                roboCat.setRust(100);
            } else if (roboCat.getRust() <= 0) {
                roboCat.setRust(0);
            }
            if (roboCat.getRust() >= 45) {
                roboCat.setHealth(roboCat.getHealth() - 10);
            } else if (roboCat.getRust() <= 20) {
                roboCat.setHealth(roboCat.getHealth() + 10);
            }
            if (roboCat.getCharge() >= 100) {
                roboCat.setCharge(100);
            } else if (roboCat.getCharge() <= 0) {
                roboCat.setCharge(0);
            }
            if (roboCat.getHealth() > 100) {
                roboCat.setHealth(100);
            } else if (roboCat.getHealth() < 0) {
                roboCat.setHealth(0);
            }
            if (roboCat.getHealth() <= 70) {
                roboCat.setHappiness(roboCat.getHappiness() - 10);
            } else if (roboCat.getHealth() >= 80) {
                roboCat.setHappiness(roboCat.getHappiness() + 10);
            }
            if (roboCat.getHappiness() >= 100) {
                roboCat.setHappiness(100);
            } else if (roboCat.getHappiness() <= 0) {
                roboCat.setHappiness(0);
            }
        }
    }

    public void feedAllDogs() {
        for (Map.Entry<Integer, OrganicDog> entry : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = entry.getValue();
            dog.feed();
        }
    }

    public void waterAllDogs() {
        for (Map.Entry<Integer, OrganicDog> entry : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = entry.getValue();
            dog.drink();
        }
    }

    public void playWithAllDogs() {
        for (Map.Entry<Integer, OrganicDog> entry : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = entry.getValue();
            dog.play();
        }
    }

    public void walkAllDogs() {
        for (Map.Entry<Integer, OrganicDog> entry : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = entry.getValue();
            dog.usePotty();
        }
    }

    public void cleanAllDogsCages() {
        for (Map.Entry<Integer, OrganicDog> entry : listOfOrganicDogs.entrySet()) {
            OrganicDog dog = entry.getValue();
            dog.cleanTheCage();
        }
    }

    public void feedAllCats() {
        for (Map.Entry<Integer, OrganicCat> entry : listOfOrganicCats.entrySet()) {
            OrganicCat cat = entry.getValue();
            cat.feed();
        }
    }

    public void waterAllCats() {
        for (Map.Entry<Integer, OrganicCat> entry : listOfOrganicCats.entrySet()) {
            OrganicCat cat = entry.getValue();
            cat.drink();
        }
    }

    public void playWithAllCats() {
        for (Map.Entry<Integer, OrganicCat> entry : listOfOrganicCats.entrySet()) {
            OrganicCat cat = entry.getValue();
            cat.play();
        }
    }

    public void cleanLitterBoxForAllCats() {
        for (Map.Entry<Integer, OrganicCat> entry : listOfOrganicCats.entrySet()) {
            OrganicCat cat = entry.getValue();
            cat.cleanTheLitterBox();
        }
    }

    public void playWithAllRoboticDogs() {
        for (Map.Entry<Integer, RoboticDog> entry : listOfRoboticDogs.entrySet()) {
            RoboticDog dog = entry.getValue();
            dog.play();
        }
    }

    public void oilAllRoboticDogs() {
        for (Map.Entry<Integer, RoboticDog> entry : listOfRoboticDogs.entrySet()) {
            RoboticDog dog = entry.getValue();
            dog.oil();
        }
    }

    public void chargeAllRoboticDogs() {
        for (Map.Entry<Integer, RoboticDog> entry : listOfRoboticDogs.entrySet()) {
            RoboticDog dog = entry.getValue();
            dog.chargeBattery();
        }
    }

    public void playWithAllRoboticCats() {
        for (Map.Entry<Integer, RoboticCat> entry : listOfRoboticCats.entrySet()) {
            RoboticCat cat = entry.getValue();
            cat.play();
        }
    }

    public void oilAllRoboticCats() {
        for (Map.Entry<Integer, RoboticCat> entry : listOfRoboticCats.entrySet()) {
            RoboticCat cat = entry.getValue();
            cat.oil();
        }
    }

    public void chargeAllRoboticCats() {
        for (Map.Entry<Integer, RoboticCat> entry : listOfRoboticCats.entrySet()) {
            RoboticCat cat = entry.getValue();
            cat.chargeBattery();
        }
    }
}
