class Node
{
	int data;
	Node next;
	Node (int d){
	data=d;
	}
}
class LList{
	Node head;
	void insertBegin(int  x){
	Node temp=new Node(x);
	temp.next=head;
	head=temp;
	}
	void printList(){
		Node cur=head;
		while(curr!=null){
			System.out.println(curr.data);
			cur=cur.next;
		}
	}
}
public class InsertAtStart001{
	public static void main(String [] args){
	LList l=new LList();
	l.insertBegin(20);
	l.printList();
	l.insertBegin(30);
	l.insertBegin(50);
	l.printList();
	}
}