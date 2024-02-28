package clients;

import java.time.LocalDate;

public class Owl extends Animal{
    public Owl(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void OwlLifeCycle(){
        cleanFeathers();
        fly();
        fly("mounts", "hunt");
        hunt();
    }
    private void cleanFeathers(){
        System.out.println(getType() + " cleans feathers");
    }
    private void fly(String place){
        System.out.println(getType() + " is flying to " + place);
    }
    private void fly(String place, String goal){
        System.out.println(getType() + "is flying to " + place + " for " + goal);
    }
    private void hunt(){
        System.out.println(getType() + " is hunting");
    }
    protected void swim(){
        System.out.println("Owl cannot swim");
    }
}