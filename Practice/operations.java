package Practice;

public class operations {

    public static class Node{
        int data;
        Node left; 
        Node right; 
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        // base case
        if(root == null )return 0;
        // recursive case 
        int l= height(root.left);
        int r = height(root.right);
        return Math.max(l, r)+1;

    }

    public static int count(Node root){
        // base case
        if(root == null )return 0;
        // recursive case 
        return height(root.left)+height(root.right)+1;

    }

    public static int sum(Node root ){
        // base case
        if(root == null )return 0;
        // recursive case 
        return (sum(root.left)+sum(root.right)+root.data);
    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        /*    1
           /     \
         3         2
       /   \     /   \
     4     5   6     7
    / \   / \ / \   / \
 null null null null null null null null


            // [1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1]
        // in this manner tha array will be created

         */

        System.out.println("hiehgt "+height(root));

        System.out.println("Total nodes = "+count(root));

        System.out.println("Sum of the tree is = "+ sum(root));

    //     System.out.println("Diameter of tree is = "+diameter(root));

    //     System.out.println("Diameter of tree optimized way is = "+diameter2(root).diam);
    // }
    
}
}
