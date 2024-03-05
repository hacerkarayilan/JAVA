package PALÝNDROME;

public class main1 {

	public static void main(String[] args) {
		LinkList1 llist = new LinkList1();
		 
        char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
        String string = new String(str);
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
        llist.pal();
	}

}
