public class Solution {
    public int minMoves(int[] nums) {
       int min= Integer.MAX_VALUE;  
	    int sum = 0;  
	    for(int n:nums){  
	        //for eachÑ­»·
	        min = Math.min(min, n);  
	        sum+=n;  
	    }  
	    return sum-nums.length*min; 
    }
}