package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void print(node head) {
		
		Queue<node> q = new LinkedList<node>();
		q.add(head);
		
		while(!q.isEmpty())
		{
			node temp = q.poll();
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
			System.out.print(temp.data+ " ");
		}
	}
}
