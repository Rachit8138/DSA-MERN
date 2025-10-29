public class a2Getters_Setters {

    public static void main(String args[]){

        Pen p1 = new Pen();//created p1 as a new object

        System.out.println("Before modifying the values of the private variables");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        System.out.println("After modifying the value of the private variables");
        p1.setColor("black");
        p1.setTip(10);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
    
}

class Pen{
   private String color = "blue";
   private int tip = 5;

    //Getters used to get value of the variables


    // this tell use the variable that we declared inside the function
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // Setters used to modify the value

    void setColor(String newColor){

        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
// if you want to find the reference of the variable this, keyword is used, 
// this is helpful when you have vaiables with same name 
// this keyword is used to refer to the current object 

// encapsulation is defined as the wrapping up of data and methods under a singlue unit. It aslos implements data hiding. 


// simple meaning 
// single entity wrapping data and methods and use access specifier for data hiding 