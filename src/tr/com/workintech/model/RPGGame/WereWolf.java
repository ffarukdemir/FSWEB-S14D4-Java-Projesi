package tr.com.workintech.model.RPGGame;

public class WereWolf extends Monster implements Bleedable, Poisinable{
    public WereWolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+poison();
    }


}
