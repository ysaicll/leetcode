public class Solution {
    public int singleNumber(int[] nums) {
     int i;
		int result=nums[0];
		for(i=1;i<nums.length;i++){
			result=result^nums[i];
		}
		//System.out.println(result);
		return result;
    }
}