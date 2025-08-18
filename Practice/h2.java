package Practice;

public class h2 {
    public static class Node {
        int data; 
        Node left;
        Node right; 
        public Node(int data){
            this.data = data;
            this.right = null; 
            this.left = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int n[]){
            idx++;
            // base case
            if(n[idx]==-1){return null;} 
            // recursive case 
            Node newNode = new Node(n[idx]);
            newNode.left= buildtree(n);
            newNode.right= buildtree(n);
            return newNode;
        }

        public static void preorder(Node root){
            // base case 
            if(root == null){
                return;
            }
            // recursive case
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            // base case 
            if(root == null){
                return;
            }
            // recursive case
            inorder(root.left);
            
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int n[] ={1,2,4,-1,-1, 5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(n);

        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
    }
    
}
