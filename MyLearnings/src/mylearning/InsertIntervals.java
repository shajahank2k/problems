package mylearning;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertIntervals {

	public static void main(String[] args) {
		int[][] interval = {{1,3},{6,9},{10,12}};
		int[] newInterval = {4,11};
		ArrayList<int[]> answer = insertIntervals(interval, newInterval);
		for(int[] ans : answer) {
			System.out.println(Arrays.toString(ans));
		}

	}
	
	public static ArrayList<int[]> insertIntervals(int[][] interval, int[] newInterval) {
		ArrayList<int[]> resultArr = new ArrayList<>();
		for(int i=0;i<interval.length;i++) {
			if(newInterval[1]<interval[i][0]) {
				resultArr.addAll(Arrays.asList(newInterval));
				for(int j=i;j<interval.length;j++) {
					resultArr.addAll(Arrays.asList(interval[j]));
				}
				return resultArr;
			}else if(newInterval[0]>interval[i][1]) {
				resultArr.addAll(Arrays.asList(interval[i]));
			}else {
				int[] arr = {Math.min(newInterval[0], interval[i][0]),Math.max(newInterval[1], interval[i][1])};
				newInterval = Arrays.copyOf(arr, arr.length);
			}
		}
		resultArr.addAll(Arrays.asList(newInterval));
		return resultArr;
	}
	
	public static int[][] insertIntervalsLeetCode(int[][] interval, int[] newInterval) {
	    ArrayList<int[]> resultArr = new ArrayList<>();
	    for(int i=0;i<interval.length;i++) {
	        if(newInterval[1]<interval[i][0]) {
	            resultArr.add(newInterval);
	            for(int j=i;j<interval.length;j++) {
	                resultArr.add(interval[j]);
	            }
	            return resultArr.toArray(new int[resultArr.size()][]);
	        } else if(newInterval[0]>interval[i][1]) {
	            resultArr.add(interval[i]);
	        } else {
	            int[] arr = {Math.min(newInterval[0], interval[i][0]),Math.max(newInterval[1], interval[i][1])};
	            newInterval = Arrays.copyOf(arr, arr.length);
	        }
	    }
	    resultArr.add(newInterval);
	    return resultArr.toArray(new int[resultArr.size()][]);
	}


}
