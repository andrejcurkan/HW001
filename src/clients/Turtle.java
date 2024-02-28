package clients;

import java.time.LocalDate;

public class Turtle extends Animal{
    public Turtle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void TurtleLifeCycle(){
        fly();
    }
    protected void fly(){
        System.out.println("Turtle cannot fly.");
    }
}