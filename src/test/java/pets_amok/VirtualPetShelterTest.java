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
    public void shouldFeedAllPets(){
        OrganicDog testPet = new OrganicDog("Testy",50,50,20,20,20,20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(testPet);
        Collection<VirtualPet> pets = underTest.retrieveAllPets();
    }
    @Test
    public void oilAll(){
        RoboticDog underTest = new RoboticDog("Billy", 50, 50, 20, 20);
        underTest.addOil();
    }
}
