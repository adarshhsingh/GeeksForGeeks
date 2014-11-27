package trees;

public class ChildrenSumProperty {

	public static boolean check(node head)
	{
		if(head==null)return true;
		if(head.left==null && head.right==null)return true;
		
		if(check(head.left) && check(head.right))
		{
			int l=(head.left==null)?0:head.left.data;
			int r=(head.right==null)?0:head.right.data;
			if(l+r==head.data)return true;
		}
		return false;
	}
}
