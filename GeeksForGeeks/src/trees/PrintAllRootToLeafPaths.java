package trees;

public class PrintAllRootToLeafPaths {

	public static void printAllRootToLeafPath(node root) {
		
		printPathUtil(root,"");
	}

	private static void printPathUtil(node root, String path) {
		if(root == null)return;
		if(root.left == null && root.right == null){
			System.out.println(path+ " -> "+root.data);
			return;
		}
		path+=" -> "+root.data;
		printPathUtil(root.left, path);	
		printPathUtil(root.right, path);		
	}

	
}
