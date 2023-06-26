package mylearning;

public class ImplementationOfLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createLinkedList(1);
		sll.InsertionInSinglyLinkedList(2,1);
		sll.InsertionInSinglyLinkedList(3,2);
		sll.InsertionInSinglyLinkedList(3,3);
		sll.InsertionInSinglyLinkedList(2,4);
		sll.InsertionInSinglyLinkedList(1,5);
//		sll.InsertionInSinglyLinkedList(5,6);
		
		SinglyLinkedList sll2 = new SinglyLinkedList();
		sll2.createLinkedList(1);
		sll2.InsertionInSinglyLinkedList(3,1);
		sll2.InsertionInSinglyLinkedList(4,2);
//		sll.InsertionInSinglyLinkedList(4,3);
//		sll.InsertionInSinglyLinkedList(5,4);
//		sll.deleteNodeInSinglyLinkedList(0);
		//sll.InsertionInSinglyLinkedList(2,5);
		
//		RemoveDuplicatesUsingLinkedList removeDups = new RemoveDuplicatesUsingLinkedList();
//		removeDups.removeDuplicatesOptimal(sll);
		
//		deleteDuplicateElementsInLinkedList deleteDups = new deleteDuplicateElementsInLinkedList();
//		LinkedList<Integer> list = deleteDups.deleteDuplicatesBruteForce(sll);
//		for(Integer ans : list) {
//			System.out.print(ans+ " ");
//		}
		
//		PartitionList pl = new PartitionList();
//		Node ans = pl.partitionListBruteForce(sll, 3);
//		removeNthNodeFromEndOfList removeNthNode = new removeNthNodeFromEndOfList();
//		Node ans = removeNthNode.removeNthNode(sll, 2);
//		MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
//		Node ans = mergeTwoSortedList.mergeTwoSortedList(sll, sll2);
//		deleteDuplicateElementsInLinkedList deleteDups = new deleteDuplicateElementsInLinkedList();
//		Node ans = deleteDups.deleteDuplicates(sll);
		
//		MiddleOfLinkedList middleofLinkedList = new MiddleOfLinkedList();
//		Node ans = middleofLinkedList.middleNode(sll);
//		while(ans!=null) {
//		System.out.print(ans.value+ " ");
//		ans = ans.next;
//		}
		
		PalindromeLinkedList pl = new PalindromeLinkedList();
		System.out.println(pl.palindromeLinkedList(sll));
		
		


	}

}
