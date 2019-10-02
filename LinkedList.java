public class LinkedList {

ListElement head;
ListElement tail;
private int length = 0;

public class ListElement {
	private ListElement next;
	/*private ListElement previous;*/
	private int data;

	public ListElement(){
		this.data = 0;
		this.next = null;
		/*this.previous = null;*/		
	}

	public void setData(int data){
		this.data = data;
	}

	public int getData(){
		return this.data;
	}

   }


 public void addElement(int data) 
	{
		ListElement temp = new ListElement();
		temp.setData(data);

		if (this.head == null) {
           		head = temp;
            		head.next = tail;
			tail = head;
       		 } else {
                tail.next = temp;
                tail = temp;
            }
        
        length++;
	}

 public void printLinkedListHead() 
    { 
        ListElement n = head; 
        while (n != null) { 
            System.out.print(n.getData()+ " "); 
            n = n.next; 
        } 
    } 


public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  

	llist.addElement(1); 
	llist.addElement(2);
	llist.addElement(3);

  
         
        llist.printLinkedListHead(); 
    } 
}
