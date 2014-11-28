/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trees;

/**
 *
 * @author Adarsh
 */

public class TreeTraversal {

	// Inorder Traversal
	static void printInorder(node temp) {
		if (temp == null)
			return;
		printInorder(temp.left);
		System.out.print(temp.data);
		printInorder(temp.right);
	}

	static void printPostorder(node temp) {
		if (temp == null)
			return;
		printPostorder(temp.left);
		printPostorder(temp.right);
		System.out.print(temp.data);
	}

	static void printPreorder(node temp) {
		if (temp == null)
			return;
		System.out.print(temp.data);
		printPreorder(temp.left);
		printPreorder(temp.right);
	}

	public static void main(String args[]) {
		node root = new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.left = new node(4);
		root.left.right = new node(5);

		System.out.printf("\nPreorder Traversal of Binary Tree : \n \t");
		printPreorder(root);
		System.out.printf("\nInorder Traversal of Binary Tree : \n \t");
		printInorder(root);
		System.out.printf("\nPostorder Traversal of Binary Tree : \n \t");
		printPostorder(root);

	}
}
