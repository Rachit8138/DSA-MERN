import java.util.*;
public class a1_Order_treverse {

    static class Node {
        int data;
        Node left;
        Node right;

        // constructor of node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        /*we will treverse the whole tree index wise and at first only 
        we will increase the index so basical we will start with zero*/
        public static Node buildTree(int nodes[]) {
            idx++;// will be zero
            // base case will stop at null mode

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes); 
            return newNode;
        }

        //#1 PreOrder Traversal
        public static void preOrder(Node root) {
            // base case
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }


        //#2 Inorder Traversal
        public static void inOrder(Node root){
            //base case
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        //#3 Post Order
        public static void postOrder(Node root){
            //base case
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        //#4 Level Order
        public static void levelOrder(Node root){ // to print elements level wise
            //base case
            if(root == null){
                return;
            }
            //we will use a queue to store the elments 
            Queue <Node> q = new LinkedList<>();
            //initial steps
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(null);
                    }else{
                        break;
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }        
        }    
    }

    public static void main(String args[]) {

        /* 
        1
       / \
      2   3
     / \   \
    4   5   6

         */
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
System.out.println();
       tree.preOrder(root);
System.out.println();
       tree.inOrder(root);
System.out.println();
       tree.postOrder(root);
System.out.println();
    //    tree.levelOrder(root);



    }

}
