
package chapter11_02;

public class Faculty extends Employee {
    
    public String officeHours;                              
    public String rank;

    public Faculty(String name) {
        super (name);
    }


    public Faculty(String name, String officeHours, String rank) {
        super(name);                                                              //using name from person class        
        this.officeHours = officeHours;                                                             //gets specfic values officehours and rank
        this.rank = rank;
    }

    public String getOfficeHours() {                                            
        return officeHours;
    }                                                                                   //setter getter methods

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override                                                                                 //overriding method to display this class
    public String toString() {
        return getName() + " " + this.getClass().getSimpleName();
    }
    
}
