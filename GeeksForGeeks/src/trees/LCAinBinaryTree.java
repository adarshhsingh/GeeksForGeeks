package trees;

public class LCAinBinaryTree {

	public static node getLCA(node head, int i, int j)
	{
		if(head==null)return null;
		
		if(head.data == i || head.data == j)
			return head;
		
		node lcaInL = getLCA(head.left,i,j);
		node lcaInR = getLCA(head.right,i,j);
		
		if(lcaInL!=null && lcaInR!=null) return head;
		
		return (lcaInL != null) ? lcaInL : lcaInR ;
	}
}
