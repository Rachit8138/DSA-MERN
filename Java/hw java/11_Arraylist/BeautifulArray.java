import java.util.*;

public class BeautifulArray{
    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer> temp = new ArrayList <>();
            int ans_size=ans.size();
            for(int i=0; i<ans_size; i++){
                if ((ans.get(i)*2-1)<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0; i<ans_size; i++){
                if ((ans.get(i)*2)<=n){
                    temp.add(ans.get(i)*2);
                    }
                }
                ans=temp;
    }
    return ans;
}

    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
    }
}






/* import java.util.ArrayList;

public class BeautifulArrayGenerator {

    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            // Add even numbers to the temporary list
            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(2 * e);
                }
            }
            
            // Add odd numbers to the temporary list
            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(2 * e - 1);
                }
            }
            
            ans = temp;
        }
        
        return ans;
    }
}
 */