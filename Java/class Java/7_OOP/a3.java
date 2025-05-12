
// types of constructor
public class a3 {

    public static void main(String args[]){

        Student s1 = new Student(); // we are making new student object
    Student s2= new Student("rachit");
Student s3= new Student(3);
    
    }
    
}
// so according to my observation Student() when the function is called the constructor are created
class Student{
    String name; 
    int roll; 
    Student(){// no parameter so non-parameterised constructor
        System.out.println("constructor is called ");
    }
    Student(String name){// since parameter is passed so it iscalled parameterised consturctor
        this.name=name; 
    }
        Student(int roll){
            this.roll=roll;
        }
    }
