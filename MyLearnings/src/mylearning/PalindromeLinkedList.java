package mylearning;

public class PalindromeLinkedList {
	
	public boolean palindromeLinkedList(SinglyLinkedList sll) {
		Node tempNode = sll.head;
		int size = 0;
		while(tempNode!=null) {
			tempNode = tempNode.next;
			size++;
		}
		int mid = size/2;
		Node prev = null;
		Node curr = sll.head;
		Node nextNode = null;
		for(int i=0;i<mid;i++) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		curr = curr.next;
		while(curr!=null) {
			if(prev.value != curr.value) {
				return false;
			}
			prev = prev.next;
			curr = curr.next;
		}
		return true;
	}

}
