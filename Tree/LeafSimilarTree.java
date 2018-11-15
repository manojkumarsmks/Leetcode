package Tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {

	public static void main(String[] args) {
		Tree root = new Tree(4);
		root.leftNode = new Tree(2);
		root.rightNode = new Tree(7);
		
		root.leftNode.leftNode = new Tree(1);
		root.leftNode.rightNode = new Tree(3);
		
		System.out.println(leafSimilar(root, root));

	}
	
	public static boolean leafSimilar(Tree root1, Tree root2) {
		List<Integer> root1List = new ArrayList<>();
		List<Integer> root2List = new ArrayList<>();
		
		root1List = leafValues(root1, root1List);
		root2List = leafValues(root2, root2List);
		
		return root1List.equals(root2List);
	}

	private static List<Integer> leafValues(Tree root1, List<Integer> root1List) {
		
		if(root1 != null) {
			
			if(root1.leftNode == null && root1.rightNode == null)
				root1List.add(root1.val);
			
			root1List = leafValues(root1.leftNode, root1List);
			root1List = leafValues(root1.rightNode, root1List);
			
		}
		
		
		return root1List;
	}

}
