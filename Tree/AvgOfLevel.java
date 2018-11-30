package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class AvgOfLevel {

	public static void main(String[] args) {
		Tree tree = new Tree();
		AverageLevel(tree.Structure());
	}

	public static void AverageLevel(Tree root) {
		Queue<Tree> queue = new LinkedList<>();
		Queue<Tree> temp;
		
		queue.add(root);

		while (!queue.isEmpty()) {
			long sum = 0; int count = 0;
			temp = new LinkedList<>();
			while(!queue.isEmpty()) {
				Tree tempTree = queue.poll();
				count++;
				sum += tempTree.val;
				temp.add(tempTree);
			}
			System.out.println((float)sum/(float)count);
			
			while(!temp.isEmpty()) {
				Tree tempTree = temp.poll();
				if(tempTree.left != null)
					queue.add(tempTree.left);
				if(tempTree.right!= null)
					queue.add(tempTree.right);
			}			
		}
	}

}
