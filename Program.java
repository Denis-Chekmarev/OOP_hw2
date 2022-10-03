import Classes.Cat;
import Classes.Chicken;
import Classes.Dog;
import Classes.Stork;
import Classes.Tiger;
import Classes.Wolf;
import Classes.Base.Controller;
import Classes.Base.Zoo;

public class Program {
    

    public static void main(String[] args) {

        // Zoo zoo = new Zoo();

        // zoo.addAnimal(new Cat("Tom"));
        // zoo.addAnimal(new Cat("Semen"));
        // zoo.addAnimal(new Chicken());
        // zoo.addAnimal(new Dog());
        // zoo.addAnimal(new Stork());
        // zoo.addAnimal(new Tiger());
        // zoo.addAnimal(new Wolf());

        // System.out.println(zoo.makeSoundAll());

        Controller controller = new Controller();
        // controller.mainLoop();
        controller.addAnimal();
        controller.addAnimal();
        controller.soundAll();
        
    }
}
