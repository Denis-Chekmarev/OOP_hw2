import java.util.InputMismatchException;
import java.util.Scanner;

import Classes.Cat;
import Classes.Chicken;
import Classes.Dog;
import Classes.Stork;
import Classes.Tiger;
import Classes.Wolf;
import Classes.Base.Zoo;

public class Program {

    private static int getNumber(int start, int end, Scanner scan){
        int input;
        try{
            input = scan.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.printf("Sorry you had done a mistake. Please input a number: ");
            scan.nextLine();
            input = getNumber(start, end, scan);
        }
        if (input < start || input >= end){
            System.out.printf("Sorry this number don't usefull. Please input a number from %d to %d: ", start, end);
            input = getNumber(start, end, scan);
        }
        return input;
    }


    public static void main(String[] args) {
        
        Integer menuPoints = 7;
        String menu = "1. Add animal\n2. Delete Animal\n3. Show info about animal\n4. Show info about all animal\n5. Make sound of animal\n6. Make noize\n7. Exit\nYour choose: ";
        String chooseAnimals = "Choose an animal\n1. Cat\n2. Chicken\n3.Dog\n4. Stork\n5. Tiger\n6. Wolf\nYour choose -> ";
        int userInput = 0; 
        int animalCount = 6;
        Zoo zoo = new Zoo();
        Scanner in = new Scanner(System.in);


        while (userInput != menuPoints){
            System.out.printf(menu);
            userInput = getNumber(1, menuPoints + 1, in);
            Integer userAnimal;
            switch (userInput){
                case 1:
                    System.out.println(chooseAnimals);
                    userAnimal = getNumber(1, animalCount + 1, in);
                    String nickname;
                    switch (userAnimal){
                        case 1:
                            System.out.printf("New animal's nickname: ");
                            in.nextLine();
                            nickname = in.nextLine();
                            zoo.addAnimal(new Cat(nickname));
                            break;
                        case 2:
                            zoo.addAnimal(new Chicken());
                            break;
                        case 3:
                            System.out.printf("New animal's nickname: ");
                            in.nextLine();
                            nickname = in.nextLine();
                            zoo.addAnimal(new Dog(nickname));
                            break;
                        case 4:
                            zoo.addAnimal(new Stork());
                            break;
                        case 5:
                            zoo.addAnimal(new Tiger());
                        case 6:
                            zoo.addAnimal(new Wolf());
                    }
                    break;
                case 2:
                    if (zoo.size() == 0){
                        System.out.printf("Zoo is empty\n");
                    }
                    else{
                        System.out.printf("Choose animal's index that you want to delete: ");
                        userAnimal = getNumber(0, zoo.size(), in);
                        String animalInfo = zoo.getInfoAnimal(userAnimal);
                        zoo.removeAnimal(userAnimal);
                        System.out.printf("Animal \"%s\" was deleted\nPress Enter to contunie -> ", animalInfo);
                        in.nextLine();
                        in.nextLine();
                    }
                    break;
                case 3: 
                    if (zoo.size() == 0){
                        System.out.printf("Zoo is empty\n");
                    }
                    else{
                        System.out.printf("Choose animal's index: ");
                        System.out.printf("%s\nPress Enter to contunie -> ", zoo.getInfoAnimal(getNumber(0, zoo.size(), in)));
                        in.nextLine();
                        in.nextLine();
                    }
                    break;
                case 4: 
                    System.out.println(zoo.getInfo());
                    in.nextLine();
                    System.out.println("Press Enter to contunie -> ");
                    in.nextLine();
                    break;
                case 5:
                    if (zoo.size() == 0){
                        System.out.printf("Zoo is empty\n");
                    }
                    else{
                        System.out.printf("Choose animal's index: ");
                        System.out.printf("%s\nPress Enter to contunie -> ", zoo.makeSound(getNumber(0, zoo.size(), in)));
                        in.nextLine();
                        in.nextLine();
                    }
                    break;
                case 6:
                    System.out.println(zoo.makeSoundAll());
                    in.nextLine();
                    System.out.println("Press Enter to contunie -> ");
                    in.nextLine();
                    break;
            }
        }
        in.close();
        System.out.printf("Program closing...\n");
    }
}
