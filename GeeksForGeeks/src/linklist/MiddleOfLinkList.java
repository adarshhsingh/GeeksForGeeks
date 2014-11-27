package linklist;

public class MiddleOfLinkList {

		public static void main(String[] args1) {

			node head = new node(1);
			head.next=new node(2);
			head.next.next=new node(3);
			head.next.next.next=new node(4);
			head.next.next.next.next=new node(5);
			
			System.out.println(getMiddle(head));
		}
	
		static int getMiddle(node head)
		{
			node slow , fast ;
			slow = fast = head ;
			
			if(head != null)
			{
				while(fast!=null && fast.next!=null)
				{
					slow=slow.next;
					fast=fast.next.next;
				}
				return slow.data;
			}
			return -1;
			
		}

}
