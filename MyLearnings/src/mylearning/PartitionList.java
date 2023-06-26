package mylearning;

public class PartitionList {

	public Node partitionListBruteForce(SinglyLinkedList sll, int x) {
		Node tempNode = sll.head;
		Node p1 = new Node();
		Node p2 = new Node();
		Node currNodeSmall = p1;
		Node currNodeBig = p2;
		while(tempNode!=null) {
			if(tempNode.value < x) {
				currNodeSmall.next = tempNode;
				currNodeSmall = currNodeSmall.next;
			}else {
				currNodeBig.next = tempNode;
				currNodeBig = currNodeBig.next;
			}
			tempNode = tempNode.next;
		}
		currNodeBig.next = null;
		currNodeSmall.next = p2.next;
		return p1.next;
	}

}
