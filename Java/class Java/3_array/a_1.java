// linear search
/*   public class a_1 {
    public static int linearsearch(int numbers[], int key){
        for (int i=0;i<numbers.length; i++){
            if (numbers [i] == key){
                return i;
            }  
        }

        return -1;

    }
    public static void main(String args[]) {
        int numbers[]={2,3,4,5,6,5,7,8,9,};
        int key=5;

        int index=linearsearch(numbers, key);
        if(index== -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index:"+index);   
        }
    }
}


 */

 public class a_1 {
    public static int linearsearch(String menu[], String key){
        for (int i=0;i<menu.length; i++){
            if (menu[i] == key){
                return i;
            }  
        }

        return -1;

    }
    public static void main(String args[]) {
        String menu[]={"momo","pizza","ham","pi","dosa"};
        String key="pi";
        int index=linearsearch(menu, key);
        if(index== -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index:"+index);   
        }
    }
}
