package linkedlist;

public class DeleteAtEndLinkedList {
    

    static Node deleteEnd(Node head) {
	if (head == null)
	    return null;
	if (head.next == null)
	    return null;
	Node curr = head;
	while (curr.next.next != null)
	    curr = curr.next;
	curr.next = null;
	return head;
    }

    public static void main(String args[]) {

	Node head1 = new Node(10);
	head1.next = new Node(20);
	head1.next.next = new Node(30);
	printlist(head1);
	System.out.println(" ");
	head1 = deleteEnd(head1);
	printlist(head1);

    }

    public static void printlist(Node head) {
	Node curr = head;
	while (curr != null) {
	    System.out.print(curr.data + " ");
	    curr = curr.next;
	}
    }
}
