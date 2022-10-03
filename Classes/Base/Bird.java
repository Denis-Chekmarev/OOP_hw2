package Classes.Base;


public abstract class Bird extends Animal {

    protected int heightFlight;


    public Bird(int heightFlight) {
        super();
        this.heightFlight = heightFlight;
    }

    public Bird(){
        super();
        this.heightFlight = 100;
    }


    public String fly(){
        return String.format("I fly on %dm", heightFlight);
    }

    
    @Override
    public String getInfo() {
        return String.format("%s, fly height: %sm", super.getInfo(), heightFlight);
    }
}
