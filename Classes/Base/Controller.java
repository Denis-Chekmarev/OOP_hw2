package Classes.Base;

import java.util.Scanner;

import Classes.Cat;



public class Controller{

    private Zoo zoo;
    private Integer userInput;
    // private Integer countMenu = 7;


    public Controller() {
        zoo = new Zoo();
        userInput = 0;
    }


    private Integer _getInput() {
        Scanner in = new Scanner(System.in);
        Integer result = in.nextInt();
        in.close();
        return result;
    }


    public void mainLoop() {
        while (userInput != 7){
            this.showMenu();
            userInput = _getInput();
            switch (userInput){
                case 1:
                    this.addAnimal();
                    break;
                case 2:
                    this.removeAnimal();
                    break;
                case 3: 
                    this.showInfoAnimal();
                    break;
                case 4: 
                    this.showAllInfo();
                    break;
                case 5:
                    this.soundAnimal();
                    break;
                case 6:
                    this.soundAll();
                    break;
            }
        }
        System.out.printf("Program closing...\n");
    }


    public void showMenu() {
        System.out.printf("1. Add animal\n2. Delete Animal\n3. Show info about animal\n4. Show info about all animal\n5. Make sound of animal\n6. Make noize\n7. Exit\nYour choose: ");
    }
    

    public void addAnimal() {
        System.out.printf("Choose an animal\n1. Cat\n2. Chicken\n3.Dog\n4. Stork\n5. Tiger\n6. Wolf\nYour choose -> ");
        Integer input = _getInput();
        switch (input){
            case 1: 
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
            case 6: 
                break;
            default:
                System.out.printf("There isn't this answer\n");
                break;
        }
    }


    public void removeAnimal() {
        
    }

    
    public void showInfoAnimal() {
        // TODO Auto-generated method stub
        
    }

    
    public void showAllInfo() {
        // TODO Auto-generated method stub
        
    }

    
    public void soundAnimal() {
        // TODO Auto-generated method stub
        
    }

    
    public void soundAll() {
        System.out.println(zoo.makeSoundAll());
    }




    public void fly() {
        
    }

    
    public void getAffection() {
        
    }

    
    public void training() {
        
    }
    

}
