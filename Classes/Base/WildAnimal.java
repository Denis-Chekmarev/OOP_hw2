package Classes.Base;

import Interfaces.IWildAnimal;

public abstract class WildAnimal extends Animal implements IWildAnimal {

    protected String area;
    protected Date dateFound;


    public WildAnimal(String area, Date date) {
        super();
        this.area = area;
        this.dateFound = date;
    }

    
    public WildAnimal() {
        this("North America", new Date(25, 12, 2013));
    }


    public WildAnimal(Double height, Double weight, String area, Date dateFound){
        this(area, dateFound);
        setHeight(height);
        setWeight(weight);
    }


    @Override
    public String getInfo() {
        return String.format("%s, Area: %s, Date found: %s", super.getInfo(), area, dateFound.getDate());
    }
    

    public void setArea(String area){
        this.area = area;
    }

    public void setDataFound(Date date){
        this.dateFound = date;
    }
}
