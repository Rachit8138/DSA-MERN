public class ads {

     static class Pen{
        String color;
        void setColor(String newColor){
            color = newColor;
        }


    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

    }
    
}
