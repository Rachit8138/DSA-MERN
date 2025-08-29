package Practice;

public class z1 {
     static class Node {
        int data; 
        Node left; 
        Node right; 
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    static int idx = -1;

    public static Node build(Node root, int values[]){
        idx++;
        if(root == null){
            Node newNode= new Node(values[idx]);
            return root;
        }
            Node newNode= new Node(values[idx]);
        
        if(root.data > values[idx]){
            root.left = ;
        }else{
            root.right = build(root.right,values);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main (String[] args){
        int values [] = {5,1,3,4,2,7};
        Node root =null;
        Node r =build(root, values);
        inorder(r);

    }
}
