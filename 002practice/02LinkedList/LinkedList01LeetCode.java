class MyLinkedList {
    
    /** Initialize your data structure here. */
    int data;
    MyLinkedList next;
	
    public MyLinkedList() {
    }
    MyLinkedList head;
	MyLinkedList tail;
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index ==0){
            return head.data;
        }
        
         MyLinkedList cur=head;
        int i=0;
        while(cur !=null){
            if (i==index){
                return cur.data;
            }
            cur=cur.next;
            i++;
        }
        return -1;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyLinkedList temp=new MyLinkedList();
        temp.data=val;
        if (head==null){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
        
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyLinkedList temp=new MyLinkedList();
        temp.data=val;
        if (head==null){
            head=tail=temp;
            return; 
        }
        tail.next=temp;
        tail=tail.next;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        MyLinkedList temp=new MyLinkedList();
        temp.data=val;
        if (index==0){
            temp.next=head;
            head=temp;
            return;
        }
        MyLinkedList pre=head,cur=head;
        cur=cur.next;
        int i=1;
        while (cur!=null){
            if (i==index){
                temp.next=cur;
                pre.next=temp;
                return;
            }
            i++;
            cur=cur.next;
            pre=pre.next;
        }
        if(i==index){
            pre.next=temp;
			tail=temp;
        }
        return;
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        if(index==0){
            head=head.next;
            return ;
        }
        MyLinkedList h=head;
        int i=1;
        while(h.next !=null){
            if (i==index){
                h.next=h.next.next;
				if (h.next==null){
				tail=h;
				}
                return;
            }
            i++;
            h=h.next;
        }
        
    }
	public void printLinkedList(){
		MyLinkedList h=head;
		while(h !=null){
			System.out.print(h.data+" ");
			h=h.next;
		}
		System.out.println(" tail="+tail.data);
	}
}
class LinkedList01LeetCode{
	public static void main(String []args){
		/*MyLinkedList obj=new MyLinkedList();
		obj.addAtHead(7);
		obj.addAtHead(2);
		obj.addAtHead(1);
		obj.printLinkedList();
		obj.addAtIndex(3,0);
		obj.deleteAtIndex(2);
		obj.printLinkedList();
		obj.addAtHead(6);
		obj.addAtTail(4);
		obj.printLinkedList();
		System.out.println(obj.get(4));
		obj.addAtHead(4);
		obj.addAtIndex(5,0);
		obj.addAtHead(6);
		*/
		System.out.println("\n\nnew example");
		MyLinkedList obj=new MyLinkedList();
		obj.addAtHead(2);
		obj.deleteAtIndex(1);
		obj.addAtHead(2);
		obj.addAtHead(7);
		obj.addAtHead(3);
		obj.addAtHead(2);
		obj.addAtHead(5);
		obj.addAtTail(5);
		System.out.println(obj.get(5));
		obj.deleteAtIndex(6);
		obj.deleteAtIndex(4);
	}
}