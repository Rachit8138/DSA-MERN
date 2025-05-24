public class shortestPath {
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
        System.out.println((float)Math.sqrt(x*x+y*y));// better if you typecast 
    }

    public static void main(String args[]) {
        
        String path="NSWWWS";
        shortestPath(path);

        // String str="HelloWorld";
        // System.out.println(str.substring(0,5));

    }
}
/*    N
      |         N y++
W_____|_____E   S y--
      |         E x++
      |         w x--
      S
1. check for individual
2. typecast it into float cause beacause (float)Math.sqrt will be giving you floating value


qn find the largest 
String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(fruits[i].compareToIgnoreCase(largest) > 0) {
                largest = fruits[i];
            }
        }
 */