package pets_amok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrganicDogTest {
    @Test
    public void createDogClass(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
    }
    @Test
    public void createCleanDirtyCage(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.cleanDirtyCage();
        int result = underTest.getDirtyCage();
        assertEquals(0,result);
    }
    @Test
    public void createOrganic(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
//        underTest.Organic();
//        boolean result = underTest.getOrganic();
//        assertEquals(true,result);
    }
    @Test
    public void createHunger(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.feedPet();
        int result = underTest.getHunger();
        assertEquals(0, result);
    }
    @Test
    public void createThirst(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.waterPet();
        int result = underTest.getThirst();
        assertEquals(0, result);
    }
    @Test
    public void createOrganicTick(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.organicTick();
        int result = underTest.getDirtyCage();
        assertThat(result > 5 && result<15);
    }
    @Test
    public void makeHungryThirstyDirtyCageTick(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.organicTick();
        int hunger = underTest.getHunger();
        assertEquals(25, hunger);
        underTest.organicTick();
        int thirst = underTest.getThirst();
        assertEquals(30, thirst);
        underTest.organicTick();
        int dirty = underTest.getDirtyCage();
        assertTrue(dirty > 5 && dirty <30);

    }

}
