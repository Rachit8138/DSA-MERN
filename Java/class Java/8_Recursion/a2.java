public class a2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Transfer top n-1 disks from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        
        // Transfer nth disk from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        
        // Transfer n-1 disks from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        
    }

    public static int Tilingproblem(int n){//2*n i.e. floor size
        // base case
        if (n==0 || n==1||n==2||n==3||n==4){
            return 1;
        }

        //return (Tilingproblem(n-1)+Tilingproblem(n-2));

        //kaam
        //vertical choice
        int fnm1=Tilingproblem(n-1);
        //horizontal choice 
        int fnm2=Tilingproblem(n-4);
        return (fnm1+fnm2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
    }

    //kaam to check if it exits or not
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
        removeDuplicates(str, idx+1, newStr, map);
    }else{
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
}

     public static void main(String args[]) {
        towerOfHanoi(7, "A", "B", "C");
        //System.out.println(Tilingproblem(8   ));
        //removeDuplicates("hellow  orld",0,new StringBuilder(""), new boolean[26] );
    }
}
