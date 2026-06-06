package br.com.victor.models.character;

public class Mage extends Character implements  Attackable, Castable{
    private String weapon;
    private int mana;

    public Mage (String name, String gender, int age, int mana, String weapon) {
        super(name,  gender, age);
        this.weapon = weapon;
        this.mana = mana;
    }

    public void attack() {
        System.out.println(getName() + " atacou com sua arma: " + getWeapon());
    }

    public void cast() {
        System.out.println(getName() + " usou magia.");
        setMana( this.mana -= 10);
    }

    public int getMana() {
        return mana;
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
