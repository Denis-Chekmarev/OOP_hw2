package Classes;

import Classes.Base.Bird;
import Interfaces.IPet;

public class Chicken extends Bird implements IPet{


    public Chicken(int heightFlight) {
        super(heightFlight);
    }

    public Chicken(){
        super();
    }

    @Override
    public String showAffection() {
        return "Chicken is gettin affection)";
    }

    @Override
    public String getInfo() {
        return String.format("Chicken - %s", super.getInfo());
    }

    @Override
    public String makeSound() {
        return "Chicken - \"Cu-ca-re-ky\"";
    }
}
