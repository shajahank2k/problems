package mylearning;

public class CheckingArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] nums = {2,1};
		System.out.println(check(nums));
	}
	
	public static boolean check(int[] nums) {
		if(nums.length == 2) {
			return true;
		}
        int index = findingIndex(nums);
        if(index == -1){
            return true;
        }
        boolean flag = true;
        if(index == 0) {
        	index = 1;
        }
        for(int i = 0;i <= index-1; i++){
            if(nums[i]>nums[i+1]){
                return flag = false;
            }
        }
        for(int j = index+1;j < nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                return flag = false;
            }
        }
        return flag;
    }

    public static int findingIndex(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }

}
