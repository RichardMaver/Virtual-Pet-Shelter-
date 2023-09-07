package pets_amok;

import pets_amok.OrganicPets.OrganicDog;

import java.util.Map;
import java.util.Scanner;

import pets_amok.OrganicPets.OrganicCat;
import pets_amok.RoboticPets.RoboticCat;
import pets_amok.RoboticPets.RoboticDog;
import pets_amok.VirtualPetShelter.VirtualPetShelter;

public class Application {
    VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
    boolean stillPlaying = true;

    public static void main(String[] args) {
        Application app = new Application();
        app.startGame();
    }

    public void startGame() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Richard's Virtual Pet Shelter. \n\tHere are all the pets we have:\n");
        while (stillPlaying = true) {
            virtualPetShelter.showListOfPets();
            System.out.println(
                    "\nWhat would you like to do?\n\n\tPet needs\n\t1. Feed Organic Pets\n\t2. Water the Organic Pets\n\t3. Play With the Pets\n\t4. Walk the Organic Dogs\n\t5. Oil the Robotic Pets\n\t6. Charge a Robotic Pet's Battery\n\n\tShelter Needs\n\t7. Clean the Dogs Cages\n\t8. Clean the Cats Litter Box\n\t9. Admit a New Pet Into the Shelter\n\t10. Adopt a Pet Out Of The Shelter\n\n\t11. Leave the Shelter");
            String action = sc.nextLine();
            try {
                int checkAction = Integer.parseInt(action);
                switch (checkAction) {
                    case 1:
                        if (virtualPetShelter.listOfOrganicDogs.isEmpty()
                                && virtualPetShelter.listOfOrganicCats.isEmpty()) {
                            System.out.println("There are no more pets to feed\n");
                        } else {
                            virtualPetShelter.feedAllDogs();
                            virtualPetShelter.feedAllCats();
                            System.out.println("You fed all the pets\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 2:
                        if (virtualPetShelter.listOfOrganicDogs.isEmpty()
                                && virtualPetShelter.listOfOrganicCats.isEmpty()) {
                            System.out.println("There are no more pets to water\n");
                        } else {
                            virtualPetShelter.waterAllDogs();
                            virtualPetShelter.waterAllCats();
                            System.out.println("You filled all the pets' water bowls\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 3:
                        if (virtualPetShelter.listOfOrganicDogs.isEmpty()
                                && virtualPetShelter.listOfOrganicCats.isEmpty()
                                && virtualPetShelter.listOfRoboticDogs.isEmpty()
                                && virtualPetShelter.listOfOrganicCats.isEmpty()) {
                            System.out.println("There are no more pets to play with\n");
                        } else {
                            virtualPetShelter.playWithAllDogs();
                            virtualPetShelter.playWithAllCats();
                            virtualPetShelter.playWithAllRoboticDogs();
                            virtualPetShelter.playWithAllRoboticCats();
                            System.out.println("You played with the pets\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 4:
                        if (virtualPetShelter.listOfOrganicDogs.isEmpty()) {
                            System.out.println("There are no more Organic Dogs to take on a walk\n");
                        } else {
                            virtualPetShelter.walkAllDogs();
                            System.out.println("You took all the Organic Dogs for a walk\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 5:
                        if (virtualPetShelter.listOfRoboticDogs.isEmpty()
                                && virtualPetShelter.listOfRoboticCats.isEmpty()) {
                            System.out.println("There are no mo Robotic pets left to oil\n");
                        } else {
                            virtualPetShelter.oilAllRoboticDogs();
                            virtualPetShelter.oilAllRoboticCats();
                            System.out.println("You oiled all the Robotic pets\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 6:
                        if (virtualPetShelter.listOfRoboticDogs.isEmpty()
                                && virtualPetShelter.listOfOrganicCats.isEmpty()) {
                            System.out.println("There are no more Robotic pets that need to be charged\n");
                        } else {
                            virtualPetShelter.chargeAllRoboticDogs();
                            virtualPetShelter.chargeAllRoboticCats();
                            System.out.println("You have charged all the batteries of the Robotic pets\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 7:
                        if (virtualPetShelter.listOfOrganicDogs.isEmpty()) {
                            System.out.println("There are no more Organic Dogs so there is no need to clean any cages\n");
                        } else {
                            virtualPetShelter.cleanAllDogsCages();
                            System.out.println("You cleaned all the Organic Dogs' cages\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 8:
                        if (virtualPetShelter.listOfOrganicCats.isEmpty()) {
                            System.out.println("There are no more Organic Cats left so the Litter Box is empty\n");
                        } else {
                            virtualPetShelter.cleanLitterBoxForAllCats();
                            System.out.println("You cleaned the Litter Box for all Organic Cats\n");
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 9:
                        boolean isDog = true;
                        boolean isOrganic = true;
                        System.out.println("Please enter the name of the pet you would like to admit into the shelter\n");
                        String admittedPetName = sc.nextLine();
                        System.out.println("Please enter a description of the pet\n");
                        String admittedPetDescription = sc.nextLine();
                        System.out.println("Is the pet you are admitting into the shelter a dog or a cat?\n");
                        String dogOrCat = sc.nextLine().toLowerCase();
                        if (dogOrCat.equals("dog")) {
                            isDog = true;
                        } else if (dogOrCat.equals("cat")) {
                            isDog = false;
                        } else {
                            System.out.println("invalid input");
                        }
                        System.out.println("Is the pet you are admitting Organic or Robotic?");
                        String organicOrRobotic = sc.nextLine().toLowerCase();
                        if (organicOrRobotic.equals("organic")) {
                            isOrganic = true;
                        } else if (organicOrRobotic.equals("robotic")) {
                            isOrganic = false;
                        } else {
                            System.out.println("invalid input");
                        }
                        if (isDog == true && isOrganic == true) {
                            OrganicDog dog = new OrganicDog(admittedPetName, admittedPetDescription);
                            virtualPetShelter.addOrganicDog(dog);
                        } else if (isDog == true && isOrganic == false) {
                            RoboticDog dog = new RoboticDog(admittedPetName, admittedPetName);
                            virtualPetShelter.addRoboticDog(dog);
                        } else if (isDog == false && isOrganic == true) {
                            OrganicCat cat = new OrganicCat(admittedPetName, admittedPetDescription);
                            virtualPetShelter.addOrganicCat(cat);
                        } else {
                            RoboticCat cat = new RoboticCat(admittedPetName, admittedPetDescription);
                            virtualPetShelter.addRoboticCat(cat);
                        }
                        System.out.println("You have successfully added " + admittedPetName + " to the shelter");
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 10:
                        boolean isAlsoDog = true;
                        boolean isAlsoOrganic = true;
                        System.out.println("Is the pet that is being adopted a Dog or a Cat?");
                        String alsoDogOrCat = sc.nextLine().toLowerCase();
                        if (alsoDogOrCat.equals("dog")) {
                            isAlsoDog = true;
                        } else if (alsoDogOrCat.equals("cat")) {
                            isAlsoDog = false;
                        } else {
                            System.out.println("invalid input");
                        }
                        System.out.println("Is the pet that is being adopted Organic or Robotic?");
                        String alsoOrganicOrRobotic = sc.nextLine().toLowerCase();
                        if (alsoOrganicOrRobotic.equals("organic")) {
                            isAlsoOrganic = true;
                        } else if (alsoOrganicOrRobotic.equals("robotic")) {
                            isAlsoOrganic = false;
                        } else {
                            System.out.println("invalid input");
                        }
                        if (isAlsoDog == true && isAlsoOrganic == true) {
                            System.out.println("Enter the Pet Id # of the Dog that is being adopted");
                            for (Map.Entry<Integer, OrganicDog> organicDog : virtualPetShelter.listOfOrganicDogs
                                    .entrySet()) {
                                Integer dogId = organicDog.getKey();
                                OrganicDog dog = organicDog.getValue();
                                System.out.println(
                                        "Pet Id # " + dogId + ": " + dog.getPetName() + ", " + dog.getPetDescription());
                            }
                            Integer adoptedPetId = sc.nextInt();
                            sc.nextLine();
                            if (virtualPetShelter.getOrganicDogId(adoptedPetId) != null) {
                                virtualPetShelter.removeOrganicDog(adoptedPetId);
                                System.out.println("Pet Number: " + adoptedPetId + " has been adopted\n");
                            } else {
                                System.out.println("Invalid pet Id number entered");
                            }
                        } else if (isAlsoDog == true && isAlsoOrganic == false) {
                            System.out.println("Enter the Pet Id # of the Robotic Dog that is being adopted");
                            for (Map.Entry<Integer, RoboticDog> roboticDog : virtualPetShelter.listOfRoboticDogs
                                    .entrySet()) {
                                Integer roboDogId = roboticDog.getKey();
                                RoboticDog roboDog = roboticDog.getValue();
                                System.out.println("Pet Id # " + roboDogId + ": " + roboDog.getPetName() + ", "
                                        + roboDog.getPetDescription());
                            }
                            Integer adoptedPetId = sc.nextInt();
                            sc.nextLine();
                            if (virtualPetShelter.getRoboticDogId(adoptedPetId) != null) {
                                virtualPetShelter.removeRoboticDog(adoptedPetId);
                                System.out.println("Pet Number: " + adoptedPetId + " has been adopted\n");
                            } else {
                                System.out.println("Invalid pet Id number entered");
                            }
                        } else if (isAlsoDog == false && isAlsoOrganic == true) {
                            System.out.println("Enter the Pet Id # of the Cat that is being adopted");
                            for (Map.Entry<Integer, OrganicCat> organicCat : virtualPetShelter.listOfOrganicCats
                                    .entrySet()) {
                                Integer catId = organicCat.getKey();
                                OrganicCat cat = organicCat.getValue();
                                System.out.println(
                                        "Pet Id # " + catId + ": " + cat.getPetName() + ", " + cat.getPetDescription());
                            }
                            Integer adoptedPetId = sc.nextInt();
                            sc.nextLine();
                            if (virtualPetShelter.getOrganicCatId(adoptedPetId) != null) {
                                virtualPetShelter.removeOrganicCat(adoptedPetId);
                                System.out.println("Pet Number: " + adoptedPetId + " has been adopted\n");
                            } else {
                                System.out.println("Invalid pet Id number entered");
                            }
                        } else {
                            System.out.println("Enter the Pet Id # of the Robotic Cat that is being adopted");
                            for (Map.Entry<Integer, RoboticCat> roboticCat : virtualPetShelter.listOfRoboticCats
                                    .entrySet()) {
                                Integer roboCatId = roboticCat.getKey();
                                RoboticCat roboCat = roboticCat.getValue();
                                System.out.println("Pet Id # " + roboCatId + ": " + roboCat.getPetName() + ", "
                                        + roboCat.getPetDescription());
                            }
                            Integer adoptedPetId = sc.nextInt();
                            sc.nextLine();
                            if (virtualPetShelter.getRoboticCatId(adoptedPetId) != null) {
                                virtualPetShelter.removeRoboticCat(adoptedPetId);
                                System.out.println("Pet Number: " + adoptedPetId + " has been adopted\n");
                            } else {
                                System.out.println("Invalid pet Id number entered");
                            }
                        }
                        virtualPetShelter.tick();
                        stillPlaying = true;
                        break;
                    case 11:
                        System.out.println(
                                "Thank you for stopping by Richard's Virtual Pet Shelter.\nWe hope to see you again!");
                        stillPlaying = false;
                        return;
                    default:
                        System.out.println("\tInvalid option selected\n");
                        stillPlaying = true;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please select the number that corresponds with action you would like to do.");
            }
        }
        sc.close();
    }
}
