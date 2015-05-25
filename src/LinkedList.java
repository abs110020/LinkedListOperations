
public class LinkedList {

	private Node head;
	private int listCount;
	
	public LinkedList(){
		
		head=new Node(0);
	}
	
	public void display(){
		
		Node current = head;
		while(current.getNext() != null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}
	
	public Node insertAtEnd(int item){
		
		Node newnode = new Node(item);
		
		if(head.next==null && listCount==0){
			   head=newnode;
		}
		else{
		 Node current= head;
		 while(current.next!=null)
			 current=current.next;
		
		current.next=newnode;
		}
	
		listCount++;
		
		return head;
		
	}
	public Node insertAtBegin(int item){
		Node newnode = new Node(item);
		if(listCount==0){
			head=newnode;	
		}
		else{
		newnode.next=head;
		head=newnode;
		}
		listCount++;
		return head;
		
		
	}
	public Node insertAtPos(int item,int index){
		Node newnode = new Node(item);
		if(index==0){
			insertAtBegin(item);
		}
		else{
		 Node current= head;
		for(int i=0;i<index-1;i++){
			 current=current.next; 
		}
		
		newnode.next=current.next;
		current.next=newnode;
		
		}
		listCount++;
		return head;
		
		
	}
	
	public Node DelAtPos(int index){
		//Node newnode = new Node(item);
	if(index==0){
		Node current= head;
		head=head.next;
		current.next=null;
	}
	else{
		 Node current= head;
		for(int i=0;i<index-1;i++){
			 current=current.next; 
		}
		Node Delnode=current.next;
		current.next=Delnode.next;
	    Delnode.next=null;
	    
	}
		listCount--;
		
		return head;
		
		
	}
	int getSize(){
		return listCount;
	}
	String isEmpty(){
		if(listCount==0)
		return "Empty";
		else
			return "Not Empty";
	}
}
