package pets_amok;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

    ArrayList<VirtualPet> pets = new ArrayList<>();


    public ArrayList<VirtualPet> retrieveAllPets() {
        return pets;
    }

    public List<VirtualPet> filterPets(Class<?> lifeFormClass, Class<?> petType) {
        List<VirtualPet> filteredPets = new ArrayList<>();
        for (VirtualPet pet : pets) {
            if (lifeFormClass.isInstance(pet) && petType == (null)) {
                filteredPets.add(pet);
            } else if (lifeFormClass.isInstance(pet) && petType.isInstance(pet)) {
                filteredPets.add(pet);
            }
        }
        return filteredPets;
    }

    public void admit(VirtualPet petToAdmit) {
        pets.add(petToAdmit);
    }

    public void realAdopt(String adoptee) {
        for (VirtualPet pet : pets) {
            if (pet.getName().equals(adoptee)) {
                pets.remove(pet);
            }
        }

    }

    public void playWithPet(String name) {
        for (VirtualPet pet : pets) {
            if (pet.getName().equals(name)) {
                pet.boredom();
            }
        }
    }

    public boolean returnName(String name) {
        for (VirtualPet pet : pets) {
            if (pet.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic) {
                ((Organic) pet).feedPet();
            }
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic)
                ((Organic) pet).waterPet();
        }
    }

    public void oilAllPets() {
        for (VirtualPet pet : pets) {
            if (pet instanceof Robotic) {
                ((Robotic) pet).addOil();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : pets)
            if (pet instanceof Dog && pet instanceof Organic) {
                ((Dog) pet).resetCage();
            }
    }

    public void shelterTick() {
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic && pet instanceof Dog) {
                int returned = ((Dog) pet).getDirtyCage();
                if (returned > 50) {
                    System.out.println("WARNING! " + pet.name + "IS IN DANGER OF DIRTYING THEIR CAGE!");
                } else if (returned > 80) {
                    System.out.println(pet.name + "has ruined their cage. You are forced to clean it.");
                    ((Dog) pet).resetCage();
                }
                if(pet instanceof Organic) {
                    ((Organic) pet).organicTick();
                }else if(pet instanceof Robotic) {
                    ((Robotic) pet).roboticTick();
                }
            }
            pet.tickAll();
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets) {
            if (pet instanceof Dog) {
                pet.boredom();
            }
        }
    }

    public void cleanCage(String input) {
        for (VirtualPet pet : pets){
            if (pet.equals(input) && pet instanceof Organic){
                ((Dog) pet).resetCage();
            }
        }
    }
}