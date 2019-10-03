/*ENSE 374 Lab 2 Assignment
  Mason Lane - 200376573
  2019-10-02
  This app will build, and traverse a linked list. Users may retrive or delete data.
  Doubly linked list is included in second branch
*/
package LinkedList;						/*package */

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

		if(pos>=length)
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

}
