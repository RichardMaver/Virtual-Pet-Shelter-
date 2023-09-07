package pets_amok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pets_amok.OrganicPets.OrganicDog;

public class testOrganicDog {
    OrganicDog testDog = new OrganicDog("Spot", "Smelly", 100, 100, 70, 70, 70, 70, 0);

    @Test
    public void feedDogTest() {
        testDog.feed();
        assertEquals(0, testDog.getHunger());
        assertEquals(73, testDog.getThirst());
    }

    @Test
    public void dogDrinkTest() {
        testDog.drink();
        assertEquals(0, testDog.getThirst());
    }

    @Test
    public void playTest() {
        testDog.play();
        assertEquals(0, testDog.getBoredom());
        assertEquals(75, testDog.getHunger());
        assertEquals(75, testDog.getThirst());
    }

    @Test
    public void pottyTest() {
        testDog.usePotty();
        assertEquals(0, testDog.getPotty());
    }

    @Test
    public void cleanAllDogsCagesTest(){
        testDog.cleanTheCage();
        assertEquals(0, testDog.getCage());
    }
}
