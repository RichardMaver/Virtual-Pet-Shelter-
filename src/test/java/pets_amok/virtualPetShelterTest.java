package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import pets_amok.OrganicPets.OrganicDog;
import pets_amok.VirtualPetShelter.VirtualPetShelter;

public class virtualPetShelterTest {
    VirtualPetShelter virtualPetShelterTest = new VirtualPetShelter();
    Map<Integer, OrganicDog> testListOfOrganicDogs = new HashMap<>();
    OrganicDog testOrganicDog = new OrganicDog("Spot", "Smelly", 100, 100, 70, 70, 70, 70, 0);
    OrganicDog testOrganicDog2 = new OrganicDog("Sparky", "Shockingly fast", 100, 100, 70, 70, 70, 70, 0);
    int organicDogCountTest;

    @Test
    public void addOrganicDogTest() {
        organicDogCountTest = testListOfOrganicDogs.size();
        testListOfOrganicDogs.put(organicDogCountTest++, testOrganicDog);
        assertEquals(1, organicDogCountTest);
    }

    @Test
    public void feedAllDogsTest(){
    testListOfOrganicDogs.put(0,testOrganicDog);
    testListOfOrganicDogs.put(1,testOrganicDog2);
    for(Map.Entry<Integer, OrganicDog> entry: testListOfOrganicDogs.entrySet()){
        OrganicDog dog = entry.getValue();
        dog.feed();
    }
    assertEquals(0, testOrganicDog.getHunger());
    assertEquals(75, testOrganicDog.getThirst());
    assertEquals(0, testOrganicDog2.getHunger());
    assertEquals(75, testOrganicDog2.getThirst());
    }

}
