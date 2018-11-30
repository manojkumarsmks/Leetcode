/**
 * 
 */
package Tree;

public class MaxElement {

	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println(MaxElementInTree(tree.Structure()));
	}
	
	public static int MaxElementInTree(Tree root) {
		return MaxElementHelper(root, Integer.MIN_VALUE);
	}
	
	public static int MaxElementHelper(Tree root, int max) {
		
		if(root == null)
			return max;
		max  = MaxElementHelper(root.left, max);
		max = MaxElementHelper(root.right, max);
		if(root.val > max) {
			max = root.val;
			return max;
			
		}
		else
			return max;
	}

}
