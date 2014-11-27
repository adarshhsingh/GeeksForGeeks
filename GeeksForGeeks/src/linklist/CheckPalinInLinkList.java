package linklist;

public class CheckPalinInLinkList {

	public static void main(String[] args1) {

		node head = new node(1);
		head.next=new node(2);
		head.next.next=new node(1);
	//	head.next.next.next=new node(2);
	//	head.next.next.next.next=new node(1);
		
		printList(head);
		if(isPalin(head)==null)
			System.out.println("NOT PALIN");
		else 
			System.out.println("IT's PALIN");
		
		
	}
	private static node isPalin(node head) {
		node front = head;
		node back = head;
		return isPalinImpl(front, back);
	}
	private static node isPalinImpl(node front, node back) {

		if(back == null)return back;
		if(back.next == null && front.next!=null) return (front.data == back.data)?front.next:null;
		else if(back.next == null && front.next==null)return (front.data == back.data)?front:null;
		node frontN = (node) isPalinImpl(front, back.next);
		if(frontN != null && frontN.next != null){
			return (frontN.data == back.data)?frontN.next:null;
		}
		if(frontN != null && frontN.next==null)
			return (frontN.data == back.data)?frontN:null;	
	
		return frontN;

	}
	private static void printList(node head) {
		System.out.println();
		while(head != null)  {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
