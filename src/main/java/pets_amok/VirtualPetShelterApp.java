package pets_amok;

import java.util.List;
import java.util.Scanner;



public class VirtualPetShelterApp {
    private static void printPets(List<VirtualPet> pets) {
        for (VirtualPet pet : pets) {
            System.out.println(pet);
        }
    }
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        VirtualPet queen = new OrganicCat("Queen", 50, 50, 25, 25, 25);
        VirtualPet johanna = new RoboticCat("Johanna", 50, 50, 25, 25);
        VirtualPet stella = new OrganicDog("Stella",50, 50, 25, 25, 25, 0);
        VirtualPet jerry = new RoboticDog("Jerry", 50, 50, 25, 25);
        virtualPetShelter.admit(queen);
        virtualPetShelter.admit(johanna);
        virtualPetShelter.admit(stella);
        virtualPetShelter.admit(stella);
        virtualPetShelter.admit(jerry);

        boolean gameRun = true;

        while(gameRun){
            System.out.println("Welcome to the shelter, these pets are depending on you for their needs." + "\n");
            System.out.println("Name•Happiness•Health•Boredom•Hunger•Thirst•Cage State");
            printPets(virtualPetShelter.filterOrganicDog());
            beginningScroll();
            int getAction = userInput.nextInt();
            userInput.nextLine();
            if (getAction == 0){
                break;
           /* }else if(getAction == 1){
                virtualPetShelter.feedAll();
            }else if(getAction == 2){
                virtualPetShelter.waterAll();
            }else if(getAction == 3){
                System.out.println("Who would you like to play with?");
                String typed = userInput.nextLine();
                if (virtualPetShelter.playWithPet(typed) == true){
                    System.out.println("you played with " + typed);
                }else {
                    System.out.println("You entered an invalid pet name. Check your capitals!");
                }
            }else if(getAction == 4){
                System.out.println("Who is being adopted?");
                virtualPetShelter.adopted(userInput.nextLine());
                System.out.println("Remember to thank the new owner for choosing adoption!" + "/n");
            }else if(getAction == 5){
                System.out.println("What is the pets Name?");
                String  name = userInput.nextLine();
                System.out.println("What is the pets Description?");
                String description = userInput.nextLine();
                virtualPetShelter.acceptNewArrival(name,description);
            }else if(getAction == 6){
                virtualPetShelter.retrieveAnimalNameAndDescription();
                System.out.println("");
                */
            }
            virtualPetShelter.shelterTick();
        }

    }

    private static void beginningScroll() {
        System.out.println("\n" +"What would you like to do with the pets?");
        System.out.println("1. Feed All Pets.");
        System.out.println("2. Water All Pets.");
        System.out.println("3. Play with a pet.");
        System.out.println("4. Adopt out a pet");
        System.out.println("5. Accept a pet into the shelter.");
        System.out.println("6. Name and Description of all pets in the shelter.");
    }
}

