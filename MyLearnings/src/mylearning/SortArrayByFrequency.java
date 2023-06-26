package mylearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortArrayByFrequency {

	public static void main(String[] args) {
		int[] nums = {2, 5, 2, 8, 5, 6, 8, 8};
		Object[] answer = sortArrayByFrequencyBruteForce(nums);
		for(Object ans : answer) {
			System.out.print(ans+ " ");
		}

	}
	
	public static Object[] sortArrayByFrequencyBruteForce(int[] nums) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Object[] resultArr = new Object[nums.length];
		int maxCount = 0;
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i])+1);
			}else {
				hm.put(nums[i], 1);
			}
		}
		for(int i=0;i<hm.size();i++) {
			int count = hm.get(nums[i]);
			if(count>maxCount) {
				maxCount = count;
			}
			for(int j=0;j<maxCount;j++) {
				list.add(nums[i]);
			}
		}
		resultArr = list.toArray();
		return resultArr;
	}

}
