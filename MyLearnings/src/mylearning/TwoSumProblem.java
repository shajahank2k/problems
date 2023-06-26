package mylearning;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumProblem {

	public static void main(String[] args) {
		int arr[] = {3,2,3};
		int target = 6;
		
		//System.out.println(twoSumBruteForce(arr,target));
		int ans[]= twoSumOptimal(arr,target);
		for(int answer: ans)
		System.out.print(answer+" ");
		

	}
	
	public static ArrayList<Integer> twoSumBruteForce(int[] arr, int target) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					list.add(i);
					list.add(j);
					return list;
				}
			}
		}
		return list;
		
		
	}
	
	public static int[] twoSumOptimal(int[] arr, int target){
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(target - arr[i])) {
				hm.put(arr[i], i);
			}else {
				return new int[] {hm.get(target - arr[i]),i};
			}
		}
		
		return null;
		
	}

}
