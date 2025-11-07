public class Constructor {

    public static void main(String args[]){

        Student s1 = new Student(); // we are making new student object
// if we remove the Student class still the java will create default constructor for it 
// if you want to make a separate student class then you need to initialize yourself
        

//Peen p1 = new Peen("blue",5);

        //System.out.println(p1.color);
    }
    
}

class Student{
    String name;
    int roll;

    // creating constructor intentionaly
    Student(){
        System.out.println("You have witten this inside the Constructor");
    }
}

class Peen{
    String color;
    int tip;

    //Giving initial values using a contrtor
    Peen(String newColor, int newTip){

        this.color = newColor;
        this.tip = newTip;

    }
}