package Practice;

public class a8 {
    public static void main(String []args){
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};

        int activities[][]= new int[start.length][3];
        for(int i= 0; i< start.length;i++){
            activities[i][0]=i;// index;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Array.sort(activities)
    }
    
}
