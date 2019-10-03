/*ENSE 374 Lab 2 Assignment
  Mason Lane - 200376573
  2019-10-02
  This app will build, and traverse a linked list. Users may retrive or delete data.
  Doubly linked list is included in second branch
*/


import java.util.Scanner;		/* user input */
import LinkedList.LinkedList;   


public class Main{

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
        System.out.println("Displaying Linked List Tail-Head:");
        llist.printLinkedListTail(); 			
							/*below allows user to retrieve, delete or quit */
	System.out.println("\n" + "\n" + "Delete value = 3, Retrieve value = 2, Quit? 1=yes, 0=No:");
	quit = in.nextInt();
	System.out.println("\n"+"_________________________________________________________________________"+"\n");

	if(quit == 3)					/*if deleting, we do the following */
	{
	System.out.println("\n"+"please enter the numerical position (tail=0) of the member you wish to delete");
	pos = in.nextInt();
	
	llist.deleteElement(pos);
	
	}
	else if(quit == 2)				/*if retrieving, we do the following */
	{
	System.out.println("\n"+"please enter the numerical position (tail=0) of the member you wish to retrieve");
	pos = in.nextInt();
	
	llist.getElement(pos);

	}
	
	/*app will exit loop and quit if user quits */

	}
    } 
}