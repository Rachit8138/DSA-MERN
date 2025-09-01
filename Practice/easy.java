package Practice;

import java.util.ArrayList;

public class easy {
    static class Node{
        int data; 
        Node left, right;
        Node(int data){this.data = data;}
    }

    public static void preOrder(Node root ){
        if (root == null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left );
        preOrder(root.right);
    }

    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        ArrayList<Integer> arr2 = new ArrayList<>();

        getInorder(root1, arr1);
        getInorder(root2, arr2);
        ArrayList<Integer> a = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                a.

            }
        }
        
    }
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null) return ;
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static void main(String args[]) {

        /*
         * 2
         * / \
         * 1 4
         * BST1
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * 9
         * / \
         * 3 12
         * 
         * BST 2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

       Node root =  mergeBST(root1,root2);

       PreOrder(root);

    }
    
}
