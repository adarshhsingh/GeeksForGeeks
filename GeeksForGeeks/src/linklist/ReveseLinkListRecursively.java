package linklist;

public class ReveseLinkListRecursively {

	public static void main(String[] args1) {

		node head = new node(1);
		head.next=new node(2);
		head.next.next=new node(3);
		head.next.next.next=new node(4);
		head.next.next.next.next=new node(5);
		
		printList(head);
		head=reverseLinkListRecursively(head);
		printList(head);
	}
	private static void printList(node head) {
		System.out.println();
		while(head != null)  {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	private static node reverseLinkListRecursively(node head) {
		
		if(head == null || head.next == null ) return head;
		
		if(head.next.next == null)
		{
			node head_ref = head.next;
			head.next.next = head;
			head.next=null;
			return head_ref;
		}
		
		node head_ref=reverseLinkListRecursively(head.next);

		head.next.next = head;
		head.next=null;
		return head_ref;
	}

	
	
}
