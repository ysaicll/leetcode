public class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum=Integer.MIN_VALUE;
        int thisSum=0;
        for(int i=0;i<nums.length;i++)
        {      	
            thisSum+=nums[i];
        	if(thisSum>maxSum)
        	    maxSum=thisSum;
            if(thisSum<0)
        		thisSum=0;     	  
        }
        //System.out.println(maxSum);
        return maxSum;
    }
}