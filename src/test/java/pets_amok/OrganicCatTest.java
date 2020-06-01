package pets_amok;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest  {

    @Test
    public void createCatConstructor(){
        OrganicCat cat = new OrganicCat("Kitty", 50,50,20,20,20);

    }
    @Test
    public void createFeedPetRaiseHappiness(){
        OrganicCat cat = new OrganicCat("Kitty", 50,50,20,20,20);
        cat.feedPet();
        int result = cat.getHunger();
        assertEquals(0, result);
        int result2 = cat.getHappiness();
        assertEquals(70, result2);
    }
    @Test
    public void createWaterPetRaiseHappiness(){
        OrganicCat cat = new OrganicCat("Kitty", 50,50,20,20,20);
        cat.waterPet();
        int result = cat.getThirst();
        assertEquals(0, result);
        int result2 = cat.getHappiness();
        assertEquals(70, result2);
    }
    @Test
    public void createOrganicTick(){
        OrganicCat cat = new OrganicCat("Kitty", 50,50,20,20,20);
        cat.organicTick();
        int result = cat.getHunger();
        assertEquals(25, result);
        int result2 = cat.getThirst();
        assertEquals(25, result2);
        int result3 = cat.getHappiness();
        assertEquals(40, result3);
    }
}