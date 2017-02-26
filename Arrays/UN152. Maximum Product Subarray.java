public class Solution {
   public int maxProduct(int[] nums) {
		/*Ҫ����һ����ĳһλ���������ֵ����Сֵ����Ϊ���������и����ĳ��֣����Ե���һλΪֹ���ܵõ������ֵ��
		 ��������֮ǰ�����ֵ���������˵õ���Ҳ��������Сֵ���������˵õ��ġ�*/
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