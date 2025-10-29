public class a1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();// pen() is a constructor createed a pen called p1, when new is then p1 obj is allocated in the heap 
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Bankaccount myAcc= new Bankaccount();
        myAcc.username = "rachit";
        // myAcc.password = "abs";// it is not visible 
        myAcc.setPassword("ABC");// ACCESSED  by publi modifier 
    }
    
}
class Bankaccount{
    public String username; 
    private String password; 
    public void setPassword(String pwd){
        password = pwd; 
    };  
}

class Pen {
    String color; //these are the attrihbutes
    int tip; 
    void setColor(String newColor){// theses are the function
        color = newColor;

    }

    void setTip(int newTip){
        tip = newTip;
    }
}


// class Student{
//     String name; 
//     int age; 
//     float percentage; 
//     void calcPercentage(int phy, int chem, int math){
//         percentage= (phy+chem+math)/3;

//     }
// }
