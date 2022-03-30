
package chapter11_02;


public class Employee extends Person {                                //has subclasses
    
    

    protected double salary;
    protected String office;                //holds the values of salary,date,officr
    protected MyDate dateHired;

    public Employee(String name) {
        super (name);
    }

    public Employee(String name, double salary, String office, MyDate dateHired) {
        super(name);                                                                        //using name from person class
        this.salary = salary;                                                                                 //gets specfic values for salary,date,offce
        this.office = office;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;                                                      //setter getter methods
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {                                               //overriding method to display this class
        return getName() + " " + this.getClass().getSimpleName();
    }
}

