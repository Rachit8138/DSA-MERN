public class OOPS{
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum((float) 1.5, (float)2.5));
    System.out.println(calc.sum(1,2,3));

    // method overriding
    Deer d = new Deer();
    d.eat();        // when child class is called it will return the assiociated value only 
    }
}

// medthod overriding
class Animal{
   void eat(){
     System.out.println("eat anything");
   } 
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
}
}
// method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

