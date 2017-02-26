public class Solution {
    public int missingNumber(int[] nums) {
            Arrays.sort(nums);
	        int count=0;	        
	        while(count<nums.length)
	       {
	    	   if(nums[count]!=count)	    	       		   
	    		   break;       
	    	   else 
			       count++;
	       }   
	       return count;
    }
}