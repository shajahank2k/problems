package mylearning;

public class MiddleOfLinkedList {
	
	public Node middleNode(SinglyLinkedList sll) {
		Node tempNode = sll.head;
		Node newNode = sll.head;
		int size = 0;
		while(tempNode!=null) {
			tempNode = tempNode.next;
			size++;
		}
		int mid = size/2;
		for(int i=0;i<mid;i++) {
			newNode = newNode.next;
		}
		return newNode;
	}

}
