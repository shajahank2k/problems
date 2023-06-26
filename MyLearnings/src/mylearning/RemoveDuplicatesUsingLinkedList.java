package mylearning;

import java.util.HashSet;

public class RemoveDuplicatesUsingLinkedList {

	
	public Node removeDuplicates(SinglyLinkedList sll) {
		int size = sll.size;
		Node tempNode = sll.head;
		int i = 0;
		while(i<size&&tempNode!=null) {
			int value = tempNode.value;
			if(tempNode.next!=null && value != tempNode.next.value) {
				tempNode.next = tempNode.next.next;
				sll.size--;
			}
			tempNode = tempNode.next;
			i++;
		}
		sll.traverseInSinglyLinkedList();
		return tempNode;
	}
	
	public Node removeDuplicatesOptimal(SinglyLinkedList sll) {
		Node tempNode = sll.head;
		int size = sll.size;
		HashSet<Integer> hs = new HashSet<>();
		Node currNode = tempNode;
		Node prevNode = null;
		for(int i=0;i<size;i++) {
			if(hs.contains(currNode.value)) {
				prevNode.next = currNode.next;
				sll.size--;
			}else {
				hs.add(currNode.value);
				prevNode = currNode;
			}
			currNode = currNode.next;
		}
		sll.traverseInSinglyLinkedList();
		return tempNode;
	}
	
//	public ListNode deleteDuplicates(ListNode head) {
//		HashSet<Integer> hs = new HashSet<>();
//		ListNode currNode = head;
//		ListNode prevNode = null;
//		while(currNode != null) {
//			if(hs.contains(currNode.val)) {
//				prevNode.next = currNode.next;
//			}else {
//				hs.add(currNode.val);
//				prevNode = currNode;
//			}
//			currNode = currNode.next;
//		}
//		return head;
//    }
	
	


}
