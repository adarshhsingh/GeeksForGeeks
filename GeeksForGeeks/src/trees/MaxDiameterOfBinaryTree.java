package trees;

public class MaxDiameterOfBinaryTree {

	static int width=0;
	public static int getWidth(node root) {
		
			calculate(root);
			return width;
	}
	
	public  static int calculate(node root) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		int leftLength = calculate(root.left); 
		int rigthLength = calculate(root.right);
		
		int w= leftLength + 1 + rigthLength ;
		
		width = (w>width)?w:width; 
				
		return 1+((leftLength>rigthLength)?leftLength:rigthLength);
	}

	
}
