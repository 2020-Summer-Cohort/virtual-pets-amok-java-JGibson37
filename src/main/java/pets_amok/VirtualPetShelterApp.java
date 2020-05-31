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
        virtualPetShelter.admit(jerry);

        boolean gameRun = true;

        while(gameRun){
            System.out.println("\nWelcome to the shelter, these pets are depending on you for their needs.\n");
            System.out.println("\nOrganic Dogs' status'\n" +
                    "Name•Happiness•Health•Boredom•Hunger•Thirst•Cage State \n");
            printPets (virtualPetShelter.filterPets(Organic.class, Dog.class));
            System.out.println("\nOrganic Cats' status'\n" +
                    "Name•Happiness•Health•Boredom•Hunger•Thirst \n");
            printPets (virtualPetShelter.filterPets(Organic.class, Cat.class));
            System.out.println("\nRobotic Pets' status'" + "\n" +
                    "Name•Happiness•Health•Boredom•Oil Level \n");
            printPets (virtualPetShelter.filterPets(Robotic.class, null));
            beginningScroll();
            int getAction = userInput.nextInt();
            userInput.nextLine();
            if (getAction == 0){
                break;
            }else if(getAction == 1){
                virtualPetShelter.feedAllPets();
            }else if(getAction == 2){
                virtualPetShelter.waterAllPets();
            }else if(getAction == 3){
                virtualPetShelter.oilAllPets();
            }else if(getAction == 4){
                virtualPetShelter.walkAllDogs();
            }else if(getAction == 5){
                System.out.println("Who's cage would you like to clean?");
                String input = userInput.nextLine();
                virtualPetShelter.cleanCage(input);
            }else if(getAction == 6){
                System.out.println("Who would you like to play with?");
                String typed = userInput.nextLine();
                if (virtualPetShelter.returnName(typed)){
                    System.out.println("You played with " + typed);
                    virtualPetShelter.playWithPet(typed);
                }else {
                    System.out.println("You entered an invalid pet name. Check your capitals!");
                }
            }else if(getAction == 7){
                System.out.println("Who is being adopted?");
                virtualPetShelter.realAdopt(userInput.nextLine());
                System.out.println("Remember to thank the new owner for choosing adoption!" + "/n");
            }else if(getAction == 8){
                System.out.println("What is the pets Name?");
                String name = userInput.nextLine();
                System.out.println("Is the pet a Dog or Cat");
                String animal = userInput.nextLine();
                System.out.println("Is the pet a Robot or is it Organic?");
                String lifeForm = userInput.nextLine();
                if (lifeForm.equalsIgnoreCase("robot") && animal.equalsIgnoreCase("cat")){
                     new RoboticCat(name,50,50,20,20);
                }else if(lifeForm.equalsIgnoreCase("robot") && animal.equalsIgnoreCase("dog")){
                    new RoboticDog(name,50,50,20,20);
                }else if(lifeForm.equalsIgnoreCase("organic")&& animal.equalsIgnoreCase("cat")){
                    new OrganicCat(name,50,50,20,20,20);
                }else if (lifeForm.equalsIgnoreCase("organic") && animal.equalsIgnoreCase("dog")){
                    new OrganicDog(name,50,50,20,20,20,0);
                }
            }
            virtualPetShelter.shelterTick();
        }

    }

    private static void beginningScroll() {
        System.out.println("\n" +"What would you like to do with the pets?");
        System.out.println("1. Feed All Organics.");
        System.out.println("2. Water All Organics.");
        System.out.println("3. Oil all Robots.");
        System.out.println("4. Clean an Organic dog's cage.");
        System.out.println("5. Play with a pet.");
        System.out.println("6. Adopt out a pet");
        System.out.println("7. Accept a pet into the shelter.");
        System.out.println("8. Name and Description of all pets in the shelter.");
    }
}

