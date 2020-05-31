package pets_amok;

public class OrganicCat extends VirtualPet implements Organic, Cat{

    protected int hunger;
    protected int thirst;

    public OrganicCat(String name, int happiness, int health, int boredom, int hunger, int thirst) {
        super(name, happiness, health, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
    }
    @Override
    public void feedPet() {
        hunger += 10;
        happiness += 20;
    }

    @Override
    public void waterPet() {
        thirst =+ 10;
        happiness += 20;
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
    public void organicTick() {
        hunger -= 5;
        thirst -= 5;
        happiness -= 10;
    }
    @Override
    public String toString() {
        return name + "•"+
                happiness + "•"+
                health + "•"+
                boredom + "•"+
                hunger + "•"+
                + thirst;
    }
}
