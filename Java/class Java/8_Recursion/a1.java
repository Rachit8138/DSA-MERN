public class a1 {
    public static void pattern(int n){
        //recursive case 
        if(n==1){
            System.out.print("1"+" ");
            return;
        }
        //base case
        System.out.print(n+" ");
        pattern(n-1);
        System.out.print(n+" ");
    }
    public static void PrintDec(int n){
        if(n==0){
        return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    public static void PrintInc(int n){
        if(n==0){
            System.out.print(n+" ");
            return; 
            }   
            PrintInc(n-1);
        System.out.print(n+" ");
    }

    public static  int fact(int n){
        if (n==0){
            return 1; 
        }
        int fn=n*fact(n-1);
        return fn;
        }

    public static int sum_n(int n){
        if (n==1){
            return 1; 
        }
        int sum=n+sum_n(n-1);
        return sum;
    }
    //  calculate nth term inn fibonacci
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    return fnm1+fnm2;
    }

    public static int first_occ(int arr[], int key, int i){ // i  is index
        if (i==arr.length){
            return -1;
        }
        if (arr[i] == key){ 
            return i;
        }

        return first_occ(arr, key, i+1);
    }

    public static int last_occ(int arr[], int key, int c){ // 
        
        if( c==arr.length){
            return -1;
        }
        int isFound =last_occ(arr, key, c+1);
        if(isFound==-1 && arr[c]== key){
            return c;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn = x * xnm1;
        // return xn;

        return x*power(x, n-1);
    }

    public static int optim_pwr(int a, int n){
        if(n==0){
            return 1;

        }
        int h=optim_pwr(a, n/2);
        
        if(n%2==0){
            return h*h;
        }else{
            return h*h*a;
        }
    }

    public static void main(String[] args) {
        pattern(5);
        // PrintDec(10);
        // PrintInc(10);
        // System.out.println(fact(11));        // factorial
         //System.out.println(sum_n(3));        // sum of n numbers
        //  System.out.println(fib(46));        // fibonacci nth term
        
        
        // int arr[]={8,3,5,9,5,10,2,5,3};
        // System.out.println(first_occ(arr, 5, 0));         //find first occurence
        // System.out.println(last_occ(arr, 5,arr.length-1));  //find last occurence
        // System.out.println(power(2, 8));                //x^n

        // // optimized x^n
        // System.out.println(optim_pwr(2, 7));

    }
}


