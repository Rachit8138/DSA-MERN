
public class a_0 {
    public static void update(int marks[], int non){
        non=10;
        for (int i=0;i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int non=5;
        update(marks, non);
        //print out marks
        for (int i=0;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println(non);
        }
}


