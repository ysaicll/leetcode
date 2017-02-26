public class Solution {
    public int removeDuplicates(int[] nums) {
       int count=1; 
	   if(nums.length<2)
        	return nums.length;     
        else
        {
        	for(int i=0;i<nums.length-1;i++)
        	{
        		if(nums[i]!=nums[i+1])
        		{ 
        			nums[count]=nums[i+1];
        			count++;
        		}
        	}
        }
	   //System.out.println(count);
	   //System.out.println(Arrays.toString(nums));
	   return count;  
    }
}
/*不仅要返回非重复值的个数（count），还要让原数组的前count个数为非重复*/