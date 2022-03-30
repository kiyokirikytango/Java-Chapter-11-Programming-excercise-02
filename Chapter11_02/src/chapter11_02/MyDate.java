
package chapter11_02;
  import java.util.Calendar;
import java.util.GregorianCalendar;


public class MyDate {                                 //class from chapter10.ex14


private int year;                              //holds year,month, day
private int month;
private int day;

public MyDate() {

GregorianCalendar cal = new GregorianCalendar(); //gets current time
year = cal.get(Calendar.YEAR);
month = cal.get(Calendar.MONTH);
day = cal.get(Calendar.DAY_OF_MONTH);

}

public MyDate(long elapsedTime) {                   //sets the time in miliseconds
GregorianCalendar cal = new GregorianCalendar();
cal.setTimeInMillis(elapsedTime);
year = cal.get(Calendar.YEAR);
month = cal.get(Calendar.MONTH);
day = cal.get(Calendar.DAY_OF_MONTH);
}

public MyDate(int year, int month, int day) {           //gets specific values
this.year = year;
this.month = month;
this.day = day;
}

public int getYear() {                              // getter and setter methods
return year;
}

public void setYear(int year) {
this.year = year;
}

public int getMonth() {
return month;
}

public void setMonth(int month) {
this.month = month;
}

public int getDay() {
return day;
}

public void setDay(int day) {
this.day = day;
}

public void setDate(long elapsedTime) {             //sets a new date
GregorianCalendar cal = new GregorianCalendar();
cal.setTimeInMillis(elapsedTime);
year = cal.get(Calendar.YEAR);
month = cal.get(Calendar.MONTH);
day = cal.get(Calendar.DAY_OF_MONTH);
}
}