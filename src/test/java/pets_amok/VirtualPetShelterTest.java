package pets_amok;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void shouldAddPetToShelter(){
        VirtualPet testPet = new BasicPet("Testy",50,50,20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(testPet);
        Collection<VirtualPet> pets = underTest.retrieveAllPets();
        assertThat(pets).containsOnlyOnce(testPet);
    }
    @Test
    public void createPlayWithPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        String tina = "Tina";
        underTest.playWithPet(tina);
    }
    @Test
    public void shouldFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAllPets();
    }
    @Test
    public void createOilAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.oilAllPets();
    }
    @Test
    public void createWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.waterAllPets();
    }
    @Test
    public void createWalkAllDogs(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.walkAllDogs();
    }
    @Test
    public void createCleanCage(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        OrganicDog Tina = new OrganicDog("Tina",50,50,20,20,20,0);
        String pet = "Tina";
        underTest.cleanCage(pet);
    }
    @Test
    public void createShelterTick(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.shelterTick();
    }
}
