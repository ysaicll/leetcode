public class Solution {
    public void moveZeroes(int[] nums) {
        //只有当i指向为非0时，且ji不同时，j后移，将j处的数改成i处的数，
        //并使i处的数字为0，ij同步后移，而当i指向为0时，只有i后移，j仍然指向0处
		int i,j=0;
		for ( i = 0; i < nums.length; i++) {
              if(nums[i]!=0){
            	  if(j!=i){
            		  nums[j]=nums[i];
            		  nums[i]=0;           		  
            	  }
            	  j++;
             }
        }
    }
}