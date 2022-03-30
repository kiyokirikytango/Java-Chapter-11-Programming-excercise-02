
package chapter11_02;

    public class Person {                                   //has subclasses
    
     public String name;             //holders for the values
    public String address;
    public String phoneNumber;
    public String email;
                
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
                                               //getter & setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
                                                                    // getSimpleName() method of java Class
    @Override                                                                           //returns the simple name of the underlying class as given in the source code.
    public String toString() {
         return getName() + " " + this.getClass().getSimpleName();   
    }
}
    /*System.out.println("Name-->"+ShapeDemo.class.getName());
     System.out.println("SimpleName-->"+ShapeDemo.class.getSimpleName());

    ex:
     getName-->com.test.ShapeDemo
     SimpleName-->ShapeDemo
     */

