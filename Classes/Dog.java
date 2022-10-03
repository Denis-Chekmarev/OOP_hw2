package Classes;

import Classes.Base.Pet;

public class Dog extends Pet {

    private Boolean isTraining;


    public Dog() {
        super();
        this.isTraining = true;
    }

    public Dog(String nickname) {
        super(nickname);
        this.isTraining = true;
    }


    public String training(){
        return "Dog is training";
    }

    @Override
    public String makeSound() {
        return "Dog - \"gaf-gaf\"";
    }

    @Override
    public String getInfo() {
        return String.format("Dog (%s) - %s, Training: %b", nickname, super.getInfo(), isTraining);
    }

    @Override
    public String showAffection() {
        return "Dog is getting affection";
    }
    

    public void setIsTraining(Boolean isTraining){
        this.isTraining = isTraining;
    }
}
