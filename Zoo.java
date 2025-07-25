import java.util.ArrayList;

import Lib.*;

public class Zoo{
    public static void main(String[] args){
ArrayList<Animal> animals = new ArrayList<>();
animals.add(new Lion("SINGTO"));
animals.add(new Eagle("MUMU"));
animals.add(new Dolphin("AUAN"));
animals.add(new Penguin("JIW"));

for(int i = 0; i < animals.size(); i++){
    System.out.println("Plase enter animal name : ");
}

for (int i = 0; i < animals.size(); i++){
    if(animals.get(i) instanceof Flyable ){
        Flyable f = (Flyable) animals.get(i);
        System.out.println(animals.get(i).getName()+""+f.fly());

        }else if(animals.get(i) instanceof Flyable ){
        Swimable s = (Swimable) animals.get(i);
        System.out.println(animals.get(i).getName()+""+s.swim());

        }else{
            System.out.println(animals.get(i).getName()+"Animal cant do anything!!!");
        }
}
    } 
}