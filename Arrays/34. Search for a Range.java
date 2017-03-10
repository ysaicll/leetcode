public class Solution {
    public int[] searchRange(int[] nums, int target) {
            int scope[]={-1,-1};   
	        for(int i=0,j;i<nums.length;i++)
	        {
	           if(nums[i]==target)                  //如果找到了target
	           {
	        	   scope[0]=i;
	        	   j=i;                             //i的使命完成，让j从i开始往后遍历
	        	   while(j<nums.length&&nums[j]==target)  //注意一下，and条件是有顺序的
	        	   {
	        		   scope[1]=j;
	        		   j++;
	        	   }
	        	   scope[1]=scope[1]>scope[0]?scope[1]:scope[0];//如果nums[i]后面还有target，更新scope[1]
	               break;
	           }	          
	        }
	       // System.out.println(Arrays.toString(scope));
	        return scope;	  
    }
}