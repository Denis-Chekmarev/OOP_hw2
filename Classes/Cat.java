package Classes;

import Classes.Base.Pet;

public class Cat extends Pet {

    private Boolean isWool;


    public Cat() {
        super();
        this.isWool = true;
    }

    public Cat(String nickname) {
        super(nickname);
        this.isWool = true;
    }

    @Override
    public String makeSound() {
        return "Cat - \"may-may\"";
    }

    @Override
    public String getInfo() {
        return String.format("Cat (%s) - %s, Wool: %b", nickname, super.getInfo(), isWool);
    }

    @Override
    public String showAffection() {
        return "Cat is getting affection";
    }

    public void setIsWool(Boolean isWool){
        this.isWool = isWool;
    }
}
