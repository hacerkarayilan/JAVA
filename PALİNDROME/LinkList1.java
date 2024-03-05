package PALÝNDROME;

import GEEKSFORGEEKS.node;

public class LinkList1 {
	node1 head;
	
	public void push(char new_data)
    {
 
        // Allocate the node and put in the data
        node1 new_node = new node1(new_data);
 
        // Link the old list off the the new one
        new_node.next = head;
 
        // Move the head to point to new node
        head = new_node;
    }
	public boolean pal() {
		node1 curr=head;
		int count=0;
		while(curr!=null) {
			count++;
			curr=curr.next;
			
		}
		String a = "";
		for(int i=0; i<count; i++) {
			a=a+curr.data;
			curr=curr.next;
		}
		String b =" ";
		for(int i=count;i>0;i--) {
			b=b+curr.data;
			curr=curr.next;
		}
		if(a==b) {
			return true;
		}
		return false;
	}
}
