package Tree;

public class SearchInBST {

	public static void main(String[] args) {
		Tree root = new Tree(4);
		root.leftNode = new Tree(2);
		root.rightNode = new Tree(7);
		
		root.leftNode.leftNode = new Tree(1);
		root.leftNode.rightNode = new Tree(3);
		
		root =  searchBST(root, 2);
		
		System.out.println(root.val);
		System.out.println(root.rightNode.val);
		System.out.println(root.leftNode.val);
	}
	
	public static Tree searchBST(Tree root, int val) {
		if(root == null)
			return null;
		if(root.val == val)
			return root;
		
		Tree tree = null;
		if(root.val > val) {
			tree = searchBST(root.leftNode, val);
		}
		else {
			tree = searchBST(root.rightNode, val);
		}
		
		return tree;
		
		
		
	}

}
