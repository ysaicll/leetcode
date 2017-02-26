public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
		if(nums.length%2!=0)
			return nums[nums.length/2];
		int count1=0;
		int count2=0;
		if(nums.length%2==0){
			for(int i=nums.length/2;i<nums.length-1;i++){
				if(nums[i]==nums[i+1])
					count1++;
			}
			for(int i=nums.length/2;i>1;i--){
				if(nums[i]==nums[i-1])
					count2++;
			}
		}
		    return count1>count2?nums[nums.length/2]:nums[nums.length/2-1];
    }
}