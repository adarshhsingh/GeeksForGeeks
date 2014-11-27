package trees;

public class TreeOperationMain {

	public static void main(String[] args) {
		
		 node root        = new node(50);
 	     root.left        = new node(7);
		 root.right       = new node(3);
		 root.left.left   = new node(3);
		 root.left.right  = new node(5);
		 root.right.left   = new node(1);
		 //root.right.right  = new node(1);
		 

		 node root2        = new node(10);
 	     root2.left        = new node(6);
		 root2.right       = new node(4);
		 root2.left.left   = new node(3);
		 root2.left.left.left   = new node(3);
		 root2.left.left.left.left   = new node(3);
		 root2.left.right  = new node(3);
		 root2.left.right.right  = new node(3);
		 root2.left.right.right.left  = new node(3);
		 root2.left.right.right.left.right  = new node(3);
			 
		 printTree(root,0);
		 System.out.println("-----------");
		 System.out.println((CheckIfBinaryTreeIsHeightBalanced.check(root)!=-1)?true:false);
//		 printTree(root, 0);
	}
	
	public static void printTree(node head, int level)
	{
		if(head==null)return;
		printTree(head.right, level+1);
		for (int i = 0; i < level; i++) {
			System.out.print("  ");
		}
		System.out.print(head.data);
		System.out.println();
		printTree(head.left, level+1);
	}
}
