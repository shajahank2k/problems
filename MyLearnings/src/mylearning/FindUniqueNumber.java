package mylearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueNumber {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,1,2,3};
		//System.out.println( uniqueNumberBruteForce(nums));
		//System.out.println( uniqueNumber(nums));
		System.out.println(uniqueNumberWithBitManipulation(nums));
		}
	
//	public static int uniqueNumberBruteForce(int[] nums) {
//		int currNum = nums[0];
//		for(int i=1;i<nums.length;i++) {
//			for(int j=1;j<nums.length;j++) {
//				if(i==j) {
//					continue;
//				}
//				if(currNum==nums[j]) {
//					
//				}
//			}
//		}
//	}
	
	public static ArrayList uniqueNumber(int[] nums) {
		
		Map<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(!hm.containsKey(nums[i])) {
				hm.put(nums[i], 1);
			}
			else {
				hm.put(nums[i], 2);
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(hm.get(nums[i])!=2) {
				list.add(nums[i]);
			}
		}
		return list;
	}
	
	public static List uniqueNumberWithBitManipulation(int[] nums) {
		int num = nums[0];
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<nums.length;i++) {
			num = num^nums[i];
		}
		if(num!=0) {
			list.add(num);
		}
		return list;
	}
	
	//public static int 

}
