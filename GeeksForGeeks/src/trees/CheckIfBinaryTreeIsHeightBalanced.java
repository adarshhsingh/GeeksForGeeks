package trees;

public class CheckIfBinaryTreeIsHeightBalanced {

	public static int check(node head) {
		
		if(head == null) {
			return 0;				
		}
		
		int l=check(head.left);
		int r=check(head.right);
		
		if(l>=0 && r>=0 && l-r<=1) {	
			return 1+((l>r)?l:r);
		}
		
		return -1;
	
	}
}
