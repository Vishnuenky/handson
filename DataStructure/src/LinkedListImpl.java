import java.util.*;

//import org.w3c.dom.Node;
public class LinkedListImpl {
	
	Node head;
	LinkedListImpl(){
		head=null;
	}
	
	class Node{
		int data;
		Node next;
		public Node(int val){
			data=val;
			next=null;
		}
	}
	
	
	
	
	 public void insertAtBegining(int val) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	 
	 public void insertAtEnd(int val) {
		 Node newNode = new Node(val);
		 //newNode.next=null;
		 if(head==null) {
			 head=newNode;
		 }else {
			 newNode.next=null; 
			 Node last = head;
			 while(last.next!=null) {
				 last=last.next;
			 }
			 last.next=newNode;
		 }
	 }
	 
	 public void insertAtPosition(int pos,int val) {
		 
		 if(pos==1) {
			 insertAtBegining(val);
			 return;
		 }else {
			 Node newNode = new Node(val);
			 Node temp = head;
			 Node prev=null;
			 for(int i =1;i<pos;i++) {
				 prev=temp;
				 temp=temp.next;
			 }
			 newNode.next=temp;
			 prev.next=newNode;
			 
		 }
	 }
	 
	 public void deleteAtPosition(int pos) {
		 if(head==null) {
			 System.out.println("Empty LinkedList.There is no element to delete");
		 }
		 if(pos==1){
			 head=head.next;
			 return;
		 }else {
			 Node temp=head;
			 Node prev=null;
			 for(int i=1;i<pos;i++) {
				 prev=temp;
				 temp=temp.next;
			 }
			 prev.next=temp.next;
			 
		 }
	 }
	 
	 public void deleteAtEnd() {
		 
		 Node prev=null;
		 Node last=head;
		 while(last.next!=null) {
			 prev=last;
			 last=last.next;
		 }
		 prev.next=null;
	 }
	 
	 public void reverse() {
		 
		 Node prev=null;
		 Node current=head;
		 Node next=head.next;
		 
		 while(current!=null) {
			 
			 next=current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
			 
		 }
		 head=prev;
		 
	 }
	 
	 public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}

	public static void main(String[] args) {
		LinkedListImpl l = new LinkedListImpl();//this linkedlist is different from this one ->LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.insertAtBegining(3);
		l.insertAtBegining(3);
		l.insertAtBegining(11);
		//l.insertAtEnd(4);
		l.insertAtPosition(1,55);
		l.insertAtPosition(3,77);
		//l.deleteAtPosition(3);
		//l.deleteAtPosition(1);
		l.display();
		
		System.out.println("Reversing Of LinkedList");
		l.reverse();
		l.display();

	}

	

}
