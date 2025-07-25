package Lib;

public class Eagle extends Animal {
    public Eagle(String name){
        super(name);
    }

    @Override
    public String fly() {
        return "The eagle soars though the sky.";

    }
    @Override
    public String makeSound() {
        return "Screech!";
    
}
}