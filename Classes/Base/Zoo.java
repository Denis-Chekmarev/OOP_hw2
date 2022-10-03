package Classes.Base;

import java.util.ArrayList;

import Interfaces.IAnimal;

/**
 * Zoo
 */
public class Zoo {

    private ArrayList<IAnimal> animals;


    public Zoo() {
        animals = new ArrayList<>();
    }


    public void addAnimal(IAnimal animal){
        animals.add(animal);
    }

    private IAnimal _getAnimal(int index){
        try{
            return animals.get(index);
        }
        catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public void removeAnimal(int index){
        animals.remove(index);
    }

    public String getInfoAnimal(int index){
        if (animals.isEmpty()){
            return "Zoo is empty";
        }
        IAnimal animal = _getAnimal(index);
        if (animal != null){
            return animal.getInfo();
        }
        return "There isn\'t this animal in zoo";
    }

    public String makeSound(int index){
        if (animals.isEmpty()){
            return "Zoo is empty";
        }
        IAnimal animal = _getAnimal(index);
        if (animal != null){
            return animal.makeSound();
        }
        return "There isn\'t this animal in zoo";
    }

    public String getInfo(){
        if (animals.isEmpty()){
            return "Zoo is empty";
        }
        String info = "";
        Integer count = 0;
        for (IAnimal animal : animals) {
            info = String.format("%s[%d] %s\n", info, count++, animal.getInfo());
        }
        return info;
    }

    public String makeSoundAll(){
        if (animals.isEmpty()){
            return "Zoo is empty";
        }
        String sound = "";
        Integer count = 0;
        for (IAnimal animal : animals) {
            sound = String.format("%s[%d] %s\n", sound, count++, animal.makeSound());
        }
        return sound;
    }
}