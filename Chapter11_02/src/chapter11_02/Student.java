
package chapter11_02;

public class Student extends Person{
 
    public static final String FRESHMAN = "Freshman";               //status of student defned as a constant
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public String status;

    public Student(String name) {
        super(name);                            //using name from person class
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;                   
    }

    @Override
    public String toString() {                                               //overriding method to display this class
         return getName() + " " + this.getClass().getSimpleName();
    }
    
}
