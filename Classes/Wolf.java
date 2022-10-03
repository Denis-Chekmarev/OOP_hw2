package Classes;

import Classes.Base.WildAnimal;

public class Wolf extends WildAnimal {

    private Boolean isLeader;
    

    public Wolf() {
        super();
        this.isLeader = false;
    }

    
    @Override
    public String makeSound() {
        return "Wolf - \"Wooo\"";
    }

    @Override
    public String getInfo() {
        return String.format("Wolf - Leader: %b, %s", isLeader, super.getInfo());
    }
    
    public void setIsLeader(Boolean isLeader){
        this.isLeader = isLeader;
    }
}
