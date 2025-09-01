package Practice;

import java.util.ArrayList;

public class asdfad {
    static class Node{
        int data;
        Node left, right;
        Node(int data){this.data=data;}
    }

    static void preOrder(Node root){
        if(root == null) return ;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node BalanceBst(Node root){
        ArrayList<Integer> arr= new ArrayList<>();
        // getting inorder sequence 
        getsortedinorder(root, arr);
        // sorted arraylist to balanced bst 
        System.out.println(arr);
        return makebst(arr, 0,arr.size()-1);
        
    }
    public static Node makebst(ArrayList<Integer> arr, int st, int ed){
        if(st>ed) return null;
        int mid = (st+ed)/2;
        Node root = new Node(arr.get(mid));
        root.left= makebst(arr, st, mid -1);
        root.right = makebst(arr, mid+1, ed);
        return root;

    }

    public static void getsortedinorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        
        getsortedinorder(root.left, arr);
        arr.add(root.data);
        getsortedinorder(root.right, arr);
    }
    public static void main(String args[]) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        
        preOrder(root);

        root = BalanceBst(root);

        System.out.println();
    
        preOrder(root);

    }
}
