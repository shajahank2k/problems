package mylearning;

public class deleteDuplicateElementsInLinkedList {
	
	public Node deleteDuplicatesBruteForce(SinglyLinkedList sll) {
		Node tempNode = sll.head;
		Node newNode = tempNode;
		Node prevNode = new Node();
		Node lastNode = new Node();
		int currValue = -1;
		while(tempNode!=null) {
			while(newNode.next!=null && tempNode.value == newNode.next.value) {
				if(sll.head.value == tempNode.value) {
					sll.head = sll.head.next;
					break;
				}
				currValue = newNode.value;
				if(tempNode.value == currValue) {
					if(lastNode.next != null) {
						lastNode.next.next = tempNode.next.next;
					}
					prevNode.next = tempNode.next.next;
					lastNode.next = prevNode;
				}
				newNode = newNode.next;
			}
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		return sll.head;
	}
	
	public Node deleteDuplicates(SinglyLinkedList sll) {
	    Node tempNode = sll.head;
	    Node prevNode = null;

	    while (tempNode != null) {
	        Node newNode = tempNode.next;

	        // remove all instances of duplicates
	        while (newNode != null && tempNode.value == newNode.value) {
	            newNode = newNode.next;
	        }

	        // update head if necessary
	        if (tempNode == sll.head && newNode != tempNode.next) {
	            sll.head = newNode;
	        } else if (newNode != tempNode.next) {
	            // remove tempNode from the list
	            prevNode.next = newNode;
	        } else {
	            // tempNode is not a duplicate
	            prevNode = tempNode;
	        }

	        tempNode = newNode;
	    }

	    return sll.head;
	}


}
