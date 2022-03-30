
package chapter11_02;

public class Staff extends Employee {
    
     protected String title;

   public Staff(String name) {                                           //using name from person class 
        super (name);
    }


    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }
                                                                            //setter getter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override                                                                       //overriding method to display this class
    public String toString() {
        return getName() + " " + this.getClass().getSimpleName();
    }
    
}
