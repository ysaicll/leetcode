public class Solution {
    public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
	        int j=0;
	        boolean a = false;
	        while(j<nums.length-1){ 
	        	 if(nums[j]==nums[j+1]){
	        		a=true;
	            	break;
	        	     
	        	 }
	        	    j++;
	        }
	        	return a;
    }
}