package Classes.Base;

public class Date {
    
    private int day;
    private int mount;
    private int year;

    public Date(int day, int mount, int year) {
        this.day = day;
        this.mount = mount;
        this.year = year;
    }

    public String getDate(){
        return String.format("%d.%d.%d", day, mount, year);
    }
}
