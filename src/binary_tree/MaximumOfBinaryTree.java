package binary_tree;

public class MaximumOfBinaryTree {
    public static void main(String[] args) {

	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	System.out.println(maximumOfBinaryTree(root));
    }
    
    public static int maximumOfBinaryTree(Node root) {
	if(root==null)return Integer.MIN_VALUE;
	return Math.max(root.key,Math.max(maximumOfBinaryTree(root.left),maximumOfBinaryTree(root.right)));
    }
}
