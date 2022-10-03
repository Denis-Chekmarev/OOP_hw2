package Classes;

import Classes.Base.Bird;
import Interfaces.IWildAnimal;

public class Stork extends Bird implements IWildAnimal {


    public Stork(int heightFlight) {
        super(heightFlight);
    }

    public Stork(){
        super();
    }


    @Override
    public String getInfo() {
        return String.format("Stork - %s", super.getInfo());
    }

    @Override
    public String makeSound() {
        return "Stork - \"tuk-tuk-tuk\"";
    }
}
