package mylearning;

public class removeNthNodeFromEndOfList {
	
	public Node removeNthNode(SinglyLinkedList sll, int n) {
		Node tempNode = sll.head;
		Node tempNode2 = sll.head;
		int indexCount = 0;
		while(tempNode!=null) {
			tempNode = tempNode.next;
			indexCount+=1;
		}
		if(n>indexCount) return null;
		if(indexCount <= 1) {
			sll.head = null;
			sll.tail = null;
			return sll.head;
		}
		int locationFromFront = indexCount-n;
		
		for(int i=0;i<=locationFromFront;i++) {
			if(locationFromFront<=0&&n>=2) {
				sll.head = sll.head.next;
			}
			if(i==locationFromFront-1) {
				tempNode2.next = tempNode2.next.next;
			}else if(tempNode2!=null) {
			tempNode2 = tempNode2.next;
			}
		}
		return sll.head;
	}
}
