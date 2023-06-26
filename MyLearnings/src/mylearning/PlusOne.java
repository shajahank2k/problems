package mylearning;
import java.io.*;
import java.util.*;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {1,2,9};
		int[] ans = plusOne(digits);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		

	}
	
	public static int[] plusOne(int[] digits) {
		
        int temp = digits[digits.length-1];
        temp = temp+1;
        if(temp>9) {
        	
        }
        digits[digits.length-1] = temp ;
		
        
        
        return digits;
    }

}
