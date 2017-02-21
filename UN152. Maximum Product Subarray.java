public class Solution {
   public int maxProduct(int[] nums) {
		/*要保留一个到某一位来看的最大值和最小值。因为在数组中有负数的出现，所以到这一位为止的能得到的最大值，
		 可能是由之前的最大值和这个数相乘得到，也可能是最小值和这个数相乘得到的。*/
	    if(nums == null || nums.length == 0)
	    	return 0;
	    int max = nums[0];
	    int maxProduct = nums[0];
	    int minProduct = nums[0];
	    for(int i = 1; i < nums.length; i ++) 
	    {
	        int prevMax = maxProduct;
	        int prevMin = minProduct;
	        maxProduct = Math.max(nums[i], Math.max(prevMax * nums[i], prevMin * nums[i]));
	        minProduct = Math.min(nums[i], Math.min(prevMin * nums[i], prevMax * nums[i]));
	        max = Math.max(max, maxProduct);
	    }
//	    System.out.println(max);
	    return max;
	}
}