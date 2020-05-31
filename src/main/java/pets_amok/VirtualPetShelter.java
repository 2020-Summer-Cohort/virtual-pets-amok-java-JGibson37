package pets_amok;

import java.util.ArrayList;

public class VirtualPetShelter {

    ArrayList<VirtualPet> pets = new ArrayList<>();

    public ArrayList<VirtualPet> retrieveAllPets() {
        return pets;
    }

    public void admit(VirtualPet petToAdmit) {
        pets.add(petToAdmit);
    }

    public void adopt(VirtualPet petToAdopt) {
        pets.remove(petToAdopt);
    }

    public void playWithPet(String name) {
        for (VirtualPet pet : pets) {
            if (pet.getName() == name)
                pet.boredom();
        }
    }

    public String returnName(String name) {
        String wrongName = "You've type a wrong name.";
        for (VirtualPet pet : pets) {
            if (pet.getName() == name) {
                return name;
            }
        }
        return wrongName;
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
            }
            pet.tickAll();
            ((Organic) pet).organicTick();
            ((Robotic) pet).roboticTick();
        }
    }
}
