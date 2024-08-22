
/**
 * The Date class represents a date with a month, day, and year.
 * This class provides methods for setting and getting the month, day, and year of the date, checking if the date is valid, and returning a String representation of the date.
 */
public class Date {
    
    
private int month; // 1-12
private int day; // 1-31 based on month
private int year; // any year

private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
/**
     * Sets the month of the date.
     * @param month the month of the date integer type
     */
 public void setMonth(int month){
        this.month=month;
    }
    /**
     * Returns the month of the date.
     * @return the month of the date integer type
     */ 
    public int getMonth(){
        return month;
    }
     /**
     * Sets the day of the date.
     * @param day the day of the date integer type
     */
    public void setDay(int day){
        this.day=day;
    }
    /**
     * Returns the day of the date.
     * @returnthe day of the date integer type
     */ 
    public int getDay(){
        return day;
    }
    /**
     * Sets the year of the date.
     * @param year the year of the date integer type
     */
     public void setYear(int year){
        this.year=year;
    }
     /**
     * Returns the year of the date.
     * @return the year of the date integer type
     */ 
    public int getYear(){
        return year;
    }

 /**
     * Constructs a Date object with the given month, day, and year.
     * @param month the month of the date integer type
     * @param day the day of the date integer type
     * @param year the year of the date integer type
     */
public Date(int month, int day, int year)//,int hour,int minute)
{
this.month = month; 
this.day = day;
this.year = year;
}
/**
     * Constructs an empty Date object.
     */
public Date(){
    
}


/**
     * Checks if the given month, day, and year form a valid date.
     * @param month the month of the date integer type
     * @param day the day of the date integer type
     * @param year the year of the date integer type
     * @return true if the date is valid, false otherwise boolean type
     * @throws IllegalArgumentException if the month or day is out of range or if the day is out of range for the specified month and year
     */
public boolean check(int month, int day, int year)
{
    boolean d=true;
    
    // check if month in range
if (month <= 0 || month > 12){
     d=false;
 throw new IllegalArgumentException( "month (" + month + ") must be 1-12");
}
// check if day in range for month 
if (day <= 0 || (day > daysPerMonth [month] && ! (month == 2 && day== 29))){
     d=false;
     throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");
}
    
   


// check for leap year if month is 2 and day is 29 
if (month== 2 && day == 29 && ! (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))){
   d=false;
   throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
}
    

return d;
}

 /**
     * Returns a String representation of the date in the format "month/day/year".
     * @return a String representation of the date
     */
@Override
public String toString()
{
return String.format("%d/%d/%d", month, day, year);
}
} // end class Date
 