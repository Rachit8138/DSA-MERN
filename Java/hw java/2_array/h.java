public class h {
    // public static void integ(int nums[]){
    //     for(int i =0; i<nums.length; i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             for(int k=j+1;k< nums.length;k++){
    //                 if( nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
    //                     System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
    //                 }
    //             }
    //         }
    //     }
    // }

    public static void integ(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
            System.out.println();
            }
            
        System.out.println();
        }
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        integ(nums);

    }
}
