public class a2_operaion {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.max(lh, rh) + 1);

        //return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int count(Node root){
        if (root==null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        
        return leftcount+rightcount+1;
    }
    public static int sum(Node root) {
            if(root == null) {
                return 0;
            }
            return sum(root.left)+sum(root.right)
    
            // int leftSum = sum(root.left);
            // int rightSum = sum(root.right);
            // return leftSum + rightSum + root.data; // when you use it as a reference you don't need .data
        }                                           // what you are calculating is the reference memeory data; 

    public static void main(String args[]) {
        /*
                    1
                   / \
                  2   3
                 / \   \
                4   5   6  
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(root.data);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
    }
    
}
