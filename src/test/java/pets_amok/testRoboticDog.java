package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pets_amok.RoboticPets.RoboticDog;

public class testRoboticDog {

    RoboticDog testRobotDog = new RoboticDog("Sparky", "Shockingly fast", 70, 70, 70, 70);

    @Test
    public void playTest(){
        testRobotDog.play();
        assertEquals(75, testRobotDog.getHappiness());
        assertEquals(65, testRobotDog.getCharge());
    }

    @Test
    public void oilTest() {
        testRobotDog.oil();
        assertEquals(0, testRobotDog.getRust());
    }

    @Test
    public void chargeTest() {
        testRobotDog.chargeBattery();
        assertEquals(100, testRobotDog.getCharge());
    }
}
