public class Main {
    public static void shortestPath(String path){
        int x=0, y=0;

        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            else if(dir =='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
                }

        }

        System.out.println((float)Math.sqrt(x*x+y*y));

    }
    public static void substring(String str){

    }
    public static void main(String args[]) {
        String path="NSWWWS";
        shortestPath(path);

        String str="HelloWorld";
        System.out.println(str.substring(0,5));




    }
}