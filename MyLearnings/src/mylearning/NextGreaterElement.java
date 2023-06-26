package mylearning;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] nums1 = { 2,1,3 };
		int[] nums2 = { 2,3,1 };
		int[] ans = nextGreaterElement(nums1, nums2);
		for (int answer : ans) {
			System.out.print(answer + " ");
		}

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		int count = 0;
		int subCount = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length - 1; j++) {
				if (nums1[i] == nums2[j]) {
					int max = 0;
					for (int k = j + 1; k < nums2.length; k++) {
						if (nums2[k] > nums1[i]) {
							max = nums2[k];
							break;
						}
					}
					if(max>0) {
						ans[count] = max;
						count++;
					}
					if (count == subCount) {
						ans[count] = -1;
						count++;
					}
					subCount++;
				}
			}
			if(nums1[i]==nums2[nums2.length-1]){
				ans[count] = -1;
				count++;
				subCount++;
			}
		}
		return ans;
	}

}
