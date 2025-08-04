import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class a11 {

    public static void main(String []args){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int act[][]= new int[start.length][3];

        for (int i = 0; i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int count =1; 
        int last = act[0][2];
        ans.add(act[0][0]);

        for(int i = 0;i<start.length; i++){
            if(act[i][1]>=last){
                count++;
                ans.add(act[i][0]);
                last = act[i][2];
            }
        }

        System.out.println(count);
        System.out.println(ans);
        
    }
    
}
