package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        underTest.Organic();
        boolean result = underTest.getOrganic();
        assertEquals(true,result);
    }
    @Test
    public void createHunger(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.Hunger();
        int result = underTest.getHunger();
        assertEquals(15, result);
    }
    @Test
    public void createThirst(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.Thirst();
        int result = underTest.getThirst();
        assertEquals(15, result);
    }
    @Test
    public void createOrganicTick(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.organicTick();
        int result = underTest.getDirtyCage();
        assertEquals(10, result);
    }
    @Test
    public void makeHungryThirstyDirtyCageTick(){
        OrganicDog underTest = new OrganicDog("Billy",50,50,20,20,20,5);
        underTest.organicTick();
        int hunger = underTest.getHunger();
        assertEquals(25, hunger);
        underTest.organicTick();
        int thirst = underTest.getThirst();
        assertEquals(25, thirst);
        underTest.organicTick();
        int dirty = underTest.getDirtyCage();
        assertEquals(10, dirty);

    }

}
