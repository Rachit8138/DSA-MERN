package Practice;
public class a7 {

    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static Node build(Node root, int values){
        // if null
        if(root == null){
            root = new Node(values);
            return root; 
        }

        if(root.data>values){
            root.left= build(root.left, values);
        }else{ 
            root.right = build(root.right, values);
        }
        return root;
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
    public static void main (String[] args){
        int values [] = {5,1,3,4,2,7};
        Node root = null;
        int n = values.length;
        for(int i = 0; i<n; i++){
            root =build(root,values[i]);
        }
        inorder(root);
    }
}
