/*ENSE 374 Lab 2 Assignment
  Mason Lane - 200376573
  2019-10-02
  This app will build, and traverse a linked list. Users may retrive or delete data.
  Doubly linked list is included in second branch
*/


import java.util.Scanner;		/* user input */


public class LinkedList {

ListElement head;			/*keeping track of our head/tail pointers*/
ListElement tail;
private int length;
private int p;



public class ListElement {
	private ListElement next;
	/*private ListElement previous;*//*for our doubly linked later*/
	private int data;

	public ListElement(){
		this.data = 0;
		this.next = null;		/*just our constructor */
		/*this.previous = null;*/	/*for our later double link */		
	}

	public void setData(int data){		/*sets the value of an element's data */
		this.data = data;
	}

	public int getData(){
		return this.data;		/* for displaying data */
	}

   }


 public void addElement(int data) 
	{
		ListElement temp = new ListElement();	/*temp element */
		temp.setData(data);			/*set the data */

		if (this.head == null) {
           		head = temp;
            		head.next = tail;		/*if we have no head, this is our head */
			tail = head;
       		 } else {
                tail.next = temp;			/* else, our value becomes the new tail */
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
		temp = temp.next;			/* traverse list until we reach the element */
		p++;
		}

		if(p>length)
		{
		System.out.println("Sorry, but this position is beyond the list size"+ "\n"); /*error checking if user enters an int too large*/
		}
		else if(p == pos)
		{
		System.out.println("\n"+"Retrieved value: " + temp.getData()+ "\n");		/*displays data of current element*/


		}

		
        
   
	}
public void deleteElement(int pos) 
	{
		ListElement temp = head;
		ListElement temp2;
		p=0;
		while(p != pos-1 && p<length && pos != 0)
		{
		temp = temp.next;				/*should stop one element before the intended */
		p++;
		}

		if(pos>=length)
		{
		System.out.println("Sorry, but this position is beyond the list size"+ "\n"); /*error check for too large input */
		}
		else if(pos == 0)				/*if the user wants to delete the head*/
		{
		head = temp.next;
		length--;
		System.out.println("Element Deleted"+ "\n");	

		}
		else if(p == length-2)				/*if the user wants to delete the tail */
		{
			tail = temp;
			temp.next = null;
			System.out.println("Element Deleted"+ "\n");	
		length--;	
		}
		else if(p == pos-1)				/*if the user wants to delete an element (not head/tail) */
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
        ListElement temp = head; 
        while (temp  != null) { 
            System.out.print(temp .getData()+ " "); 	/*starting from head, we move down the list displaying its contents*/
           temp  = temp.next; 
        } 
	}else
	{
	 System.out.print("list is empty"); 		/*if the user has emptied the list by deletion or other means */
	}
    } 

 /*public void printLinkedListHead() 
    { 
        ListElement n = head; 
        while (n != null) { 
            System.out.print(n.getData()+ " "); 	plaseholder for printing list from tail-head
            n = n.next; 
        } 
    } 
*/

public static void main(String[] args) 			/* main fxn */
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 		/*initiate our linked list */
  	Scanner in = new Scanner(System.in);  		/* prepare scanner for input */
	int insert;					/* preparing ints for various input, etc*/
	int x;
	int  choice =0;
	int pos;
	int quit=0;
	
	System.out.println("Length of list: ");		/*user enters the size of their desired list */
	choice = in.nextInt();	


	while (quit != 1){				/*loop until user quits */
	for (int i = 0; i<choice; i++){

	System.out.println("Add number to stack: ");
	x = in.nextInt();

	llist.addElement(x); 				/*adds a new element until weve reached our length*/

	

	
	}
  	choice = 0;					/*sets to 0. Upon each loop, user will not have to re-enter their list data */
	System.out.println("_________________________________________________________________________"+"\n");
        System.out.println("Displaying Linked List Head-Tail:");
        llist.printLinkedListHead(); 			/*above displays list and contains some __ for easier reading */
							/*below allows user to retrieve, delete or quit */
	System.out.println("\n" + "\n" + "Delete value = 3, Retrieve value = 2, Quit? 1=yes, 0=No:");
	quit = in.nextInt();
	System.out.println("\n"+"_________________________________________________________________________"+"\n");

	if(quit == 3)					/*if deleting, we do the following */
	{
	System.out.println("\n"+"please enter the numerical position (head=0) of the member you wish to delete");
	pos = in.nextInt();
	
	llist.deleteElement(pos);
	
	}
	else if(quit == 2)				/*if retrieving, we do the following */
	{
	System.out.println("\n"+"please enter the numerical position (head=0) of the member you wish to retrieve");
	pos = in.nextInt();
	
	llist.getElement(pos);

	}
	
	/*app will exit loop and quit if user quits */

	}
    } 
}
