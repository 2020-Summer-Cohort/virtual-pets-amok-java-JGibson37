package pets_amok;

public class RoboticCat extends VirtualPet implements Cat, Robotic{

    private int oilLevel;

    public RoboticCat(String name, int happiness, int health, int boredom, int oilLevel) {
        super (name, happiness, health, boredom);
        this.oilLevel = oilLevel;
    }

    @Override
    public void addOil() {
        oilLevel += 25;
    }
    public int getOil(){
        return oilLevel;
    }

    @Override
    public void roboticTick() {
        oilLevel -= 5;
    }
    @Override
    public String toString() {
        return name + "•"+
                happiness + "•"+
                health + "•"+
                boredom + "•"+
                oilLevel;
    }
}
