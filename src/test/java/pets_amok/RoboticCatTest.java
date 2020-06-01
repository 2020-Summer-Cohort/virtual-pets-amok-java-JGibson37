package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticCatTest {
    @Test
    public void createRoboticCat(){
        RoboticCat cat = new RoboticCat("Kitty", 50,50,20,20);
    }
    @Test
    public void createAddOil(){
        RoboticCat cat = new RoboticCat("Kitty", 50,50,20,20);
        cat.addOil();
        int result = cat.getOil();
        assertEquals(45, result);
    }
    @Test
    public void createRoboticTick(){
        RoboticCat cat = new RoboticCat("Kitty", 50,50,20,20);
        cat.roboticTick();
        int result = cat.getOil();
        assertEquals(15, result);
    }
}
