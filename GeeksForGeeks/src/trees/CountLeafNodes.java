package trees;

public class CountLeafNodes {

	static int count=0;
	public static int getCount(node head) {
		
		if(head == null)return 0;
		if(head.left == null && head.right == null)
			return 1;
		return getCount(head.left)+getCount(head.right);
	}
}
