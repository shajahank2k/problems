package mylearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		//int[] arr = {-1,0,1,2,-1,-4};
		int[] arr = {0,0,0};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		//System.out.println(ThreeSumBruteForce(arr));
		System.out.println(ThreeSumOptimalForSortedArray(arr));
		//System.out.println(ThreeSumOptimalForUnSortedArray(arr));

	}
	
	public static List<List<Integer>> ThreeSumBruteForce(int arr[]) {
		
		List<List<Integer>> totalList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[i-1]+arr[j]==0) {
					list.add(arr[i-1]);
					list.add(arr[i]);
					list.add(arr[j]);
				}
				
			}
		}
		totalList.add(list);
		
		return totalList;
	}
	
	public static List<List<Integer>> ThreeSumOptimalForSortedArray(int arr[]) {
		Arrays.sort(arr);
		List<List<Integer>> listOfTriplets = new ArrayList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
				int p1 = i + 1;
				int p2 = arr.length - 1;

				while (p1 <= p2) {
					if ((arr[i] == -(arr[p1] + arr[p2]))) {
						listOfTriplets.add(new ArrayList<>(Arrays.asList(arr[i], arr[p1], arr[p2])));
						if (listOfTriplets.contains(Arrays.asList(0, 0, 0))) {
							return listOfTriplets;
						}
						while (p1 < p2 && arr[p1] == arr[p1 + 1]) {
							p1++;
						}
						while (p1 < p2 && arr[p2] == arr[p2 - 1]) {
							p2--;
						}
						p1++;
						p2--;
					} else if (arr[p1] + arr[p2] > (arr[i])) {
						p2--;
					} else {
						p1++;
					}
				}
			}
		}
		return listOfTriplets;
	}
	
	public static List<List<Integer>> ThreeSumOptimalForUnSortedArray(int arr[]){
		List<List<Integer>> listOfTriplets = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(hm.containsKey(-(arr[i]+arr[j]))) {
					listOfTriplets.add(new ArrayList(Arrays.asList(arr[i],arr[j],hm.get(-(arr[i]+arr[j])))));
				}else {
					hm.put(arr[j], j);
				}
			}
		}
		return listOfTriplets;
	}

}
