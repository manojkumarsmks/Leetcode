package Tree;

public class MaxDepthOfBinaryTree {

	public static void main(String[] args) {
		Tree root = new Tree(3);
		root.left = new Tree(9);
		root.right = new Tree(20);
		
		root.right.left = new Tree(15);
		root.right.right = new Tree(3);
		System.out.println(maxDepth(root));
	}
	
	public static int maxDepth(Tree root) {
		if(root == null)
			return 0;
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return Math.max(left, right)+1;
		
	}

}
