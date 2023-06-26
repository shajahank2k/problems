package mylearning;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;

	public Node createLinkedList(int nodeValue) {

		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void InsertionInSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			createLinkedList(nodeValue);
			return;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}

	public void traverseInSinglyLinkedList() {
		Node tempNode = head;
		if (head != null) {
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value + " ");
				tempNode = tempNode.next;
			}
		} else {
			System.out.println("Node doesn't exist");
		}
		System.out.println();
	}

	public boolean searchSinglyLinkedList(int nodeValue) {
		Node tempNode = head;
		if (head != null) {
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue)
					return true;
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node doesn't exit");
		return false;
	}
	
	public void deleteNodeInSinglyLinkedList(int location) {
		Node tempNode = head;
		if(head == null) {
			System.out.println("Node doesn't exist");
		}else if(size<=1) {
			head = null;
			tail = null;
		}
		else if(location == 0) {
			head = tempNode.next;
		}else if(location >= size){
			for(int i=0;i<location;i++) {
				if(i==location-1) {
					tempNode.next = null;
					tail = tempNode;
				}
				tempNode = tempNode.next;
			}
		}else {
			for(int i=0;i<location;i++) {
				if(i==location-1) {
					tempNode.next = tempNode.next.next;
				}
				tempNode = tempNode.next;
			}
		}
		size--;
	}
	
	public void deleteLinkedList() {
		head = null;
		tail = null;
		size = 0;
		System.out.println("LinkedList Deleted Successfully");
	}

}
