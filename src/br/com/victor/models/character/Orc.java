package br.com.victor.models.character;

public class Orc extends Character implements  Attackable{
    private String weapon;

    public Orc (String name, String gender, int age, String weapon) {
        super(name,  gender, age);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void attack () {
         System.out.println(getName() + " atacou com sua arma: " + getWeapon());
     }
}
