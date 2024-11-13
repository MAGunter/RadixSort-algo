package entity;

import utility.Random;

public class Person {
    String firstName;
    String lastName;
    private Random random;

    public Person(){
        random = new Random();
        this.firstName = random.getRandomName();
        this.lastName = random.getRandomSurname();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName +
                '}';
    }
}
