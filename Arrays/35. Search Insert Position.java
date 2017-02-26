public class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=1;
	if (target==0||target<=nums[0])
		return 0;
	if(target>nums[nums.length-1])
		return nums.length;
	for(;i<nums.length-1;i++)
	   {   	    
        	if(nums[i]==target||(target>nums[i-1]&&target<nums[i]))
        	break;       	      	
        }
         return i; 
    }
}