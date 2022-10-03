package Classes.Base;

import Interfaces.IAnimal;

public abstract class Animal implements IAnimal  {
    
    protected Double height;
    protected Double weight;
    protected String eyeColor;


    public Animal(Double height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public Animal(Double height, Double weight) {
        this(height, weight, "black");
    }
    
    public Animal(Double height) {
        this(height, 50.0, "black");
    }

    public Animal() {
        this(0.5, 50.0, "black");
    }
    

    public void setHeight(Double height){
        this.height = height;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }


    @Override
    public String getInfo() {
        return String.format("Height: %.2fm, Weight: %.2fkg, Eye color: %s", height, weight, eyeColor);
    }
}
