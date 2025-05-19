import java.util.*;
public class a_11 {
    public static void update(int marks[],int nonochangeable){
        nonochangeable=10;
        for (int i=0;i<marks.length;i++){
            marks[i]= marks[i];

        }
    }
    public static void main(String[] args) {
        int marks[]={9,3,5};
        int nonochangeable=4;
        update(marks, nonochangeable);
        System.out.println(nonochangeable);
        for (int i =0; i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();

    }
    
}
