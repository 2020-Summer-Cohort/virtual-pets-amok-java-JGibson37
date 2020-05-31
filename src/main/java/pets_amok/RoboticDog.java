package pets_amok;

public class RoboticDog extends VirtualPet implements Robotic, Dog {

    private int oilLevel;

    public RoboticDog(String name, int happiness, int health, int boredom, int oilLevel) {
        super (name, happiness, health, boredom);
        this.oilLevel = oilLevel;
    }

    public void addOil() {
        oilLevel += 20;
        happiness +=10;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void roboticTick() {
        oilLevel -= 5;
    }

    @Override
    public void walkAll() {
        boredom -= 25;
        happiness+=15;
    }

    @Override
    public int getDirtyCage() {
        return 0;
    }

    @Override
    public void resetCage() {
    }
}
