package br.com.victor.models.character;

public class Elf extends  Character implements Attackable, Castable{
    private int mana;
    private String weapon;

    public Elf (String name, String gender, int age, int mana, String weapon) {
        super(name, gender, age);
        this.mana = mana;
        this.weapon = weapon;
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

    public void attack() {
        System.out.println(getName() + " atacou com sua arma: " + getWeapon());
    }

    public void cast() {
        System.out.println(getName() + " usou magia.");
        setMana(this.mana -= 10);
    }
}
