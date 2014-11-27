package linklist;

/*
 * Make a class 'node' in same package (example: package linklist) as program,
 * for every program of LinkList to access it.
 class node {
 	int data;
 	node next;
 	
 	node(int value) {
 		this.data=value;
 		this.next=null;
 	}
 }
 *
 */
public class GetNthNodeInALinkList {
	
	public static node GetNth(node head, int n) {
		node current = head;
		int count = 1;
		while (null != current) {
			if (count == n)
				return current;
			current = current.next;
			count++;
		}
		return null;
	}

	public static void main(String[] args) {
	
		node head = new node(1);
		head.next = new node(2);
		head.next.next = new node(3);
		head.next.next.next = new node(4);
		head.next.next.next.next = new node(5);
		int n = 4;
		node nth = GetNth(head, n);
		if (null == nth)
			System.out.println(n + "th node is not present");
		else
			System.out.println(n + "th node data is : " + nth.data);
	}

}
