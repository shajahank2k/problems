package mylearning;

import java.util.ArrayList;

public class TwoPointers {

	public static void main(String[] args) {
		int arr[] = {-4, -3, -3, -3, -2, -2, -2, -1, -1, 0, 1, 2, 2, 3};
		
		ArrayList<Integer[]> ans = twoPointersApproach(arr);
		for(Integer arr1[]: ans) {
			for(Integer arr2 : arr1) {
		System.out.print(arr2+ " ");
			}
			System.out.println();
		}

	}
	
	public static ArrayList<Integer[]> twoPointersApproach(int arr[]){
		ArrayList<Integer[]> list = new ArrayList<>();
		int p1 = 0;
		int p2 = arr.length-1;
		Integer[] result = null;
		while(p1!=p2) {
			if(arr[p1]+arr[p2]<0) {
				p1++;
			}else if(arr[p1]+arr[p2]>0) {
				p2--;
			}else if(arr[p1]+arr[p2]==0) {
				result = new Integer[] {arr[p1],arr[p2]};
				list.add(result);
				p1++;
				p2--;
				while(p1 < p2 && arr[p1] == arr[p1-1]) {
					p1++;
				}
				while(p1 < p2 && arr[p2] == arr[p2+1]) {
					p2--;
				}
			}
		}
		return list;
	}

}
