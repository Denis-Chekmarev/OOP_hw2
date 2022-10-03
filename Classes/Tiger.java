package Classes;

import Classes.Base.Animal;
import Interfaces.IWildAnimal;

public class Tiger extends Animal implements IWildAnimal {


    public Tiger() {
        super();
    }

    
    @Override
    public String makeSound() {
        return "Tiger - \"Rrrrrr\"";
    }

    @Override
    public String getInfo() {
        return String.format("Tiger - %s", super.getInfo());
    }
    
}
