package br.com.victor.models.character;

public class Character {
    private String name, gender, race, weapon;
    private int age, helth = 100, mana = 30;

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Race: " + race);
        System.out.println("Age: " + age);
        System.out.println("Helth: " + helth);
        System.out.println("Mana: " + mana);
        System.out.println("Weapon: " + weapon);
    }

    public int getMana() {
        return mana;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    public int getHelth() {
        return helth;
    }

    private void setHelth(int helth) {
        this.helth = helth;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
