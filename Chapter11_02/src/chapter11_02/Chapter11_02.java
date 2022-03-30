/*
Chapter 11 Programming excercise 02
Riky Hernandez
10/08/21
Description: Design a class named Person with Subclass of student and Employee(subclass of Faculty and staff,also using Mydate Class
                Program that has an Override toString() Method for each class
         _..._
      .'     '.      _
     /    .-""-\   _/ \
   .-|   /:.   |  |   |
   |  \  |:.   /.-'-./
   | .-'-;:__.'    =/
   .'=  *=|NASA _.='
  /   _.  |    ;
 ;-.-'|    \   |
/   | \    _\  _\
\__/'._;.  ==' ==\
         \    \   |
         /    /   /
         /-._/-._/
         \   `\  \
          `-._/._/
*/
package chapter11_02;


public class Chapter11_02 {

   
    public static void main(String[] args) {
     
         Person person = new Person("Riky");
        Student student = new Student("rIky");                                  //user will enter the name for each member
        Employee employee = new Employee("riKy");
        Faculty faculty = new Faculty("rikY");
        Staff staff = new Staff("RiKy");
                                                                                //will print their name and what class they belong to
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
        
    }
 
