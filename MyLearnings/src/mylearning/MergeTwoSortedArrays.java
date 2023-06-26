package mylearning;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};
		int m = 3;
		int n = 3;
		mergeTwoSortedArrays(arr1,m,arr2,n);
		for(int ans : arr1) {
			System.out.print(ans+ " ");
		}

	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] resultArr = new int[arr1.length+arr2.length];
		int p1 = 0;
		int p2 = 0;
		int i = 0;
		while(p1 < arr1.length && p2 < arr1.length) {
			if(arr1[p1]<arr2[p2]) {
				resultArr[i] = arr1[p1];
				i++;
				p1++;
			}else if(arr1[p1]>arr2[p2]) {
				resultArr[i] = arr2[p2];
				i++;
				p2++;
			}else {
				resultArr[i] = arr1[p1];
				resultArr[i+1] = arr2[p1];
				i = i+2;
				p1++;
				p2++;
			}
		}
		if(p1>arr1.length) {
			resultArr[i] = arr2[p2];
		}else {
			resultArr[i] = arr1[p1];
		}
		return resultArr;
	}
	
	public static void mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
		int[] resultArr = new int[m+n];
		int p1 = 0;
		int p2 = 0;
		int i = 0;
		while(p1 < m && p2 < n) {
			if(nums1[p1]<nums2[p2]) {
				resultArr[i] = nums1[p1];
				i++;
				p1++;
			}else if(nums1[p1]>nums2[p2]) {
				resultArr[i] = nums2[p2];
				i++;
				p2++;
			}else {
				resultArr[i] = nums1[p1];
				resultArr[i+1] = nums2[p2];
				i = i+2;
				p1++;
				p2++;
			}
		}
		for(int k=i;k<resultArr.length;k++) {
			if(p1>=m) {
				resultArr[k] = nums2[p2];
				p2++;
			}else {
				resultArr[k] = nums1[p1];
				p1++;
			}
		}
		for(int j=0;j<resultArr.length;j++) {
			nums1[j] = resultArr[j];
		}
	}

}
