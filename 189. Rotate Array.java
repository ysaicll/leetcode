public class Solution {
    public void rotate(int[] nums, int k) {
         if(k>nums.length)
			  k=k%(nums.length);
		  if(nums==null||k==0)
			  return;
       int temp1,temp2,temp3,m,count=0;;
	        for(int i=0;i<nums.length/2;i++){
	            temp1=nums[i];
	            nums[i]=nums[nums.length-1-i];
	            nums[nums.length-1-i]=temp1;
	         // System.out.print(nums[i]);
	        }
	        for(int j=0;j<k/2;j++){
	        	 temp2=nums[j];
		         nums[j]=nums[k-1-j];
		         nums[k-1-j]=temp2;
		        // System.out.print(nums[j]);
	        }
	       
	        for( m=k;m<(nums.length+k)/2;m++){
	        	 temp3=nums[m];
		         nums[m]=nums[nums.length-1-count];
		         nums[nums.length-1-count]=temp3;
		         //System.out.print(nums[m]);
		         count++;
	    }
    }
}