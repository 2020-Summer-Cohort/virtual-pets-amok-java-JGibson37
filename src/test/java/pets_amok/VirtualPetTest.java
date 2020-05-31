package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void createVirtualPetClass() {
        VirtualPet underTest = new BasicPet("Billy",50,50,20);
    }
    @Test
    public void createHealthAndGetter(){
        VirtualPet underTest = new BasicPet("Billy",50,50,20);
        underTest.health();
        int result = underTest.getHealth();
        assertEquals(60, result);
    }
    @Test
    public void createBoredomGetterSetter(){
        VirtualPet underTest = new BasicPet("Billy",50,50,20);
        underTest.boredom();
        int result = underTest.getBoredom();
        assertEquals(15,result);
    }
    @Test
    public void tickAll(){
        VirtualPet underTest = new BasicPet("Billy",50,50,20);
        underTest.tickAll();
        int result = underTest.getHappiness();
        assertEquals(45, result);
        result = underTest.getHealth();
        assertEquals(45, result);
        result = underTest.getBoredom();
        assertEquals(25, result);
    }
}