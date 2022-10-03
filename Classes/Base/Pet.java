package Classes.Base;

import Interfaces.IPet;

public abstract class Pet extends Animal implements IPet {
        
    protected String nickname;
    protected String breed;
    protected Boolean isVaccination;
    protected String colorWool;
    protected Date birthday;
    

    public Pet() {
        this("Default nicname", "Scotland", true, "black", new Date(9,4,2015));
    }

    public Pet(String nickname) {
        this(nickname, "Scotland", true, "black", new Date(9,4,2015));
    }

    public Pet(String nickname, String breed, Double height, Double weight, String colorWool, Date birthday){
        this(nickname, breed, true, colorWool, birthday);
        setHeight(height);
        setWeight(weight);
    }

    public Pet(String nickname, String breed, Boolean isVaccination, String colorWool, Date birthday) {
        super();
        this.nickname = nickname;
        this.breed = breed;
        this.isVaccination = isVaccination; 
        this.colorWool = colorWool;
        this.birthday = birthday;
    }


    @Override
    public String getInfo() {
        return String.format("Nickname: %s, Breed: %s, Vaccination: %s, Wool color: %s, Birthday: %s, %s", nickname, breed, isVaccination, colorWool, birthday.getDate(), super.getInfo());
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setIsVaccination(Boolean isVaccination){
        this.isVaccination = isVaccination;
    }

    public void setColorWool(String colorWool){
        this.colorWool = colorWool;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
}
