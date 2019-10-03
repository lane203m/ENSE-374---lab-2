import java.util.Scanner;		/* user input */


public class LinkedList {

ListElement head;
ListElement tail;
private int length;
private int p;



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

public void getElement(int pos) 
	{
		ListElement temp = head;
		p=0;
		while(p != pos && p<length)
		{
		temp = temp.next;
		p++;
		}

		if(p>length)
		{
		System.out.println("Sorry, but this position is beyond the list size"+ "\n");
		}
		else if(p == pos)
		{
		System.out.println("\n"+"Retrieved value: " + temp.getData()+ "\n");		


		}

		
        
   
	}
public void deleteElement(int pos) 
	{
		ListElement temp = head;
		ListElement temp2;
		p=0;
		while(p != pos-1 && p<length && pos != 0)
		{
		temp = temp.next;
		p++;
		}

		if(pos>=length)
		{
		System.out.println("Sorry, but this position is beyond the list size"+ "\n");
		}
		else if(pos == 0)
		{
		head = temp.next;
		length--;
		System.out.println("Element Deleted"+ "\n");	

		}
		else if(p == length-2)
		{
			tail = temp;
			temp.next = null;
			System.out.println("Element Deleted"+ "\n");	
		length--;	
		}
		else if(p == pos-1)
		{
			
		temp2 = temp.next;
		temp.next = temp2.next;
		length--;
		System.out.println("Element Deleted" + "\n");	



		}

		
        
   
	}







 public void printLinkedListHead() 
    { 
	if (length != 0)
	{
        ListElement n = head; 
        while (n != null) { 
            System.out.print(n.getData()+ " "); 
            n = n.next; 
        } 
	}else
	{
	 System.out.print("list is empty"); 
	}
    } 

 /*public void printLinkedListHead() 
    { 
        ListElement n = head; 
        while (n != null) { 
            System.out.print(n.getData()+ " "); 
            n = n.next; 
        } 
    } 
*/

public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  	Scanner in = new Scanner(System.in);  
	int insert;
	int x;
	int  choice =0;
	int pos;
	int quit=0;
	
	System.out.println("Length of list: ");
	choice = in.nextInt();	


	while (quit != 1){
	for (int i = 0; i<choice; i++){

	System.out.println("Add number to stack: ");
	x = in.nextInt();

	llist.addElement(x); 

	

	
	}
  	choice = 0;
	System.out.println("_________________________________________________________________________"+"\n");
        System.out.println("Displaying Linked List Head-Tail:");
        llist.printLinkedListHead(); 
	System.out.println("\n" + "\n" + "Delete value = 3, Retrieve value = 2, Quit? 1=yes, 0=No:");
	quit = in.nextInt();
	System.out.println("\n"+"_________________________________________________________________________"+"\n");

	if(quit == 3)
	{
	System.out.println("\n"+"please enter the numerical position (head=0) of the member you wish to delete");
	pos = in.nextInt();
	
	llist.deleteElement(pos);
	
	}
	else if(quit == 2)
	{
	System.out.println("\n"+"please enter the numerical position (head=0) of the member you wish to retrieve");
	pos = in.nextInt();
	
	llist.getElement(pos);

	}
	


	}
    } 
}
