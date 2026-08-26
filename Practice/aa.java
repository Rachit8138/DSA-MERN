import java.util.ArrayList;

public class aa {
    static class Edge{
        int src, dest, wt; 
        public Edge(int s, int d, int w ){
            this.src= s;
            this.dest=d;
            this.wt= w; 
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<7;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge( 0,  1,  1));
        graph[0].add(new Edge( 0, 2,  1));

        graph[1].add(new Edge( 1, 0,  1));
        graph[1].add(new Edge( 1, 3 , 1));

        graph[2].add(new Edge( 2,  0,  1));
        graph[2].add(new Edge( 2,  4,  1));

        graph[3].add(new Edge( 3,  1,  1));
        graph[3].add(new Edge( 3,  4,  1));
        graph[3].add(new Edge( 3,  5,  1));

        graph[4].add(new Edge( 4,  2,  1));
        graph[4].add(new Edge( 4,  3,  1));
        graph[4].add(new Edge( 4,  5,  1));

        graph[5].add(new Edge( 5,  6,  1));
        graph[5].add(new Edge( 5,  3,  1));
        graph[5].add(new Edge( 5,  4,  1));

    }

    static void bfs(ArrayList<Edge> graph[]){

    }

    public static void main(String args[]){
        int v =7; 
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
    }

}

