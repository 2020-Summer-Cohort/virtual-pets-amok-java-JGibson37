package pets_amok;

public class OrganicDog extends VirtualPet implements Dog, Organic {

    private int hunger;
    private int thirst;
    private int dirtyCage;

    public OrganicDog(String name, int happiness, int health, int boredom, int hunger, int thirst, int dirtyCage) {
        super(name, happiness, health, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
        this.dirtyCage = dirtyCage;
    }

    public int cleanDirtyCage() {
        dirtyCage = 0;
        return dirtyCage;
    }

    @Override
    public void feedPet() {
        hunger -= 5;
        happiness += 10;
    }

    @Override
    public void waterPet() {
        thirst -= 5;
        happiness += 10;
    }
    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public int getThirst() {
        return thirst;
    }

    @Override
    public void walkAll() {
        boredom -= 25;
        happiness += 15;
    }

    public int getDirtyCage() {
        return dirtyCage;
    }

    public void resetCage() {
        dirtyCage = 0;
        happiness /= 2;
    }

    @Override
    public void organicTick() {
        int rand = (int) (Math.random() * ((10 - 1) + 1));
        int largeRand = (int) (Math.random() * ((25 - 10) + 1));
        hunger += 5;
        thirst += 5;
        if (dirtyCage < 50) {
            dirtyCage += rand;
            System.out.println(name + " has dirtied their cage by " + rand);
        } else if (dirtyCage > 50 && rand > 5) {
            dirtyCage += largeRand;
            System.out.println("ATTENTION! " +name + " has dirtied their cage by " + largeRand);
        }
    }
    @Override
    public String toString() {
        return name + "•"+
                happiness + "•"+
                health + "•"+
                + boredom + "•"+
                hunger + "•"+
                + thirst + "•"+
                dirtyCage;
    }
}