/* this program contain basic operations of linked list like node insert at last,mid of list,kth node from last*/
class LList1{
	Node head;
	void insertAtStart(int d){
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
	}
	void insertEnd(int d){
		Node temp=new Node(d);
		if(head ==null){
			head=temp;
			return;
		}
		Node cur= head;
		while(cur.next!=null){
			cur= cur.next;
		}
		cur.next=temp;
	}
	void printList1(){
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
	}
	void printMid(){
		
		if(head == null ){
			return ;
		}
		Node fast=head;
		Node slow=head;
		while (fast!=null && fast.next !=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
	}
	
	void printNFromTail(int n){
		Node first=head,second=head;
		for (int i=0;i<n;i++){
			if(first==null)return;
			first=first.next;
		}
		while(first!=null){
			first=first.next;
			second=second.next;
		}
		System.out.println(second.data);
	}
}
public class InsertAtEnd002{
	public static void main(String [] args){
	LList1 l=new LList1();
	l.insertEnd(20);
	System.out.println("output");
	l.printList1();
	l.insertEnd(30);
	l.insertEnd(50);
	System.out.println("output");
	l.printList1();
	System.out.println("mid of list");
	l.printMid();
	l.insertAtStart(90);
	l.insertAtStart(100);
	System.out.println("List");
	l.printList1();
	System.out.println("Last second");
	l.printNFromTail(2);
	}
}