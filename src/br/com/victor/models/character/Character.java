package br.com.victor.models.character;

public class Character {
    private String name, gender;
    private int age, health = 100;

    public Character (String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.health = 100;
    }

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Health: " + health);
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
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
