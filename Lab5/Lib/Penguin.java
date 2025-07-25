package Lib;

public class Penguin extends Bird implements Swimable {
   
    public Penguin(String name){
        super(name);
    }

    @Override
    public String swim() {
        return "The penguin dives gracefuuly in the water.";
    }
    @Override
    public String makeSound() {
        return "Squawk";

    
    }
}
