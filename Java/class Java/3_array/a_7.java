//trapped rainwater
public class a_7 {
    public static int findtotalwater(int arr[], int n){
        int[] lmax= new int[n];

        int max=0;
        for (int i = 0; i<n;i++){
            max=Math.max(max,arr[i]);
            lmax[i] = max;
        }

        int[] rmax= new int[n];

        max=0;
        for (int i = n-1; i>=0;i--){
            max=Math.max(max,arr[i]);
            rmax[i] = max;
        }

        int ans=0;
        for (int i = 0; i < n; i++){
            int lb=lmax[i];
            int rb=rmax[i];

            int min=Math.min(lb,rb);
            int currentwater=min-arr[i];
            ans=ans+currentwater;
        }
        return ans;
    }

    

    public static void main(String[] args) {
        int arr[]={3,0,0,0,2,4};
        int n=arr.length;
        System.out.println(findtotalwater(arr, n));

    }
    
}
