package mylearning;

public class MergeTwoSortedList {
	
	public Node mergeTwoSortedList(SinglyLinkedList sll, SinglyLinkedList sll2) {
		Node p1 = sll.head;
		Node p2 = sll2.head;
		Node newNode = new Node();
		Node currNode = newNode;
		while(p1!=null && p2!=null) {
			if(p1.value < p2.value) {
				currNode.next = p1;
				currNode = currNode.next;
				p1 = p1.next;
			}else {
				currNode.next = p2;
				currNode = currNode.next;
				p2 = p2.next;
			}
		}
		if (p1 == null)
			currNode.next = p2;
        if (p2 == null)
        	currNode.next = p1;
		return newNode.next;
	}

}
