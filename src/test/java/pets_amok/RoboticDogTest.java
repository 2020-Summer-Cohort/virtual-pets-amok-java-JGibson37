package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDogTest {

    @Test
    public void createRoboticDog(){
        RoboticDog underTest = new RoboticDog("Billy", 50, 50, 20, 20);
    }
    @Test
    public void createOilLevel(){
        RoboticDog underTest = new RoboticDog("Billy", 50, 50, 20, 20);
        underTest.addOil();
        int result = underTest.getOilLevel();
        assertEquals(40, result);
    }
    @Test
    public void createRoboticTick(){
        RoboticDog underTest = new RoboticDog("Billy", 50, 50, 20, 20);
        underTest.roboticTick();
        int result = underTest.getOilLevel();
        assertEquals(15, result);
    }
    @Test
    public void createWalkAll(){
        RoboticDog underTest = new RoboticDog("Billy", 50, 50, 20, 20);
        underTest.walkAll();
        int result = underTest.getBoredom();
        assertEquals(55, result);
    }
}
