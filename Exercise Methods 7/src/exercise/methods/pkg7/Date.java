
package exercise.methods.pkg7;


public class Date {
    
    private int Month;
    private int Day;
    private int Year;//variabile de instanta
    //public static String CALENDAR_TYPE = "Gregorian"; exemplu de variabila de clas
    
    public Date(){
    this(0,0,0);
    }

    public Date(int Month, int Day, int Year) {
        this.Month = Month;
        this.Day = Day;
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void displayDate(){
        System.out.println(Month+" / "+Day+" / "+Year+" / ");
        
    }
    
    
    
}
