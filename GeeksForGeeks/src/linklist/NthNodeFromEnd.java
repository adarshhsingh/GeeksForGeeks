package linklist;

public class NthNodeFromEnd {

	public static void main(String[] args1) {

		node head = new node(1);
		head.next=new node(2);
		head.next.next=new node(3);
		head.next.next.next=new node(4);
		head.next.next.next.next=new node(5);
		
		System.out.println(getNthFromLast(head, 5));
	}

	private static int getNthFromLast(node head, int n) {
		
		node front=head;
		node back=head;
		int count=0;
		while(count<n)
		{
			if(front==null)return -1;
			front=front.next;
			count++;
		}
	
		while(front!=null)
		{
			front=front.next;
			back=back.next;
		}
		
		return back.data;
	}

}
