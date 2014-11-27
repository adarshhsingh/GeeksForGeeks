package trees;

public class MaxDepthOfTree {

	public static int getMaxDepth(node root) {
	
		if(root == null) return 0;
		return 1+Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
	}
}
