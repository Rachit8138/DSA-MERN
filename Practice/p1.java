package Practice;

public class p1 {
    public static class Node {
        int data; 
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;   
            this.right  = null; 
        }
    }

     static class BinaryTree{
        static int idx = -1; 
        public  Node buildtree(int []nodes){
            idx++;
            // base case 
            if(nodes[idx]==-1){
                return null;
            }
            // recursive case 
            Node newNode= new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

void preOrder(Node root){
        // base case 
        if(root == null) return; 
        // recursive case 
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){
        int []nodes={1,2,-1,-1, 3,-1,-1};
        BinaryTree tree = new BinaryTree(); 
        Node root = tree.buildtree(nodes);
        tree.preOrder(root);
        

    }
    
}
