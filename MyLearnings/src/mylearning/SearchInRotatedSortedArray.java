package mylearning;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 3;
		int ans = searchInRotatedSortedArray(nums,target);
		System.out.println(ans);

	}
	
	public static int searchInRotatedSortedArray(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
