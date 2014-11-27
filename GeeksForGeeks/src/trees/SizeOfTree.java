package trees;

public class SizeOfTree {

	static int size=0;
	public static int getSize(node root) {
		
		if(root==null)return 0;
		return getSize(root.left) + 1 + getSize(root.right);
	}

	
}
