public class NumArray {
int[] sums;
public NumArray(int[] nums) {  
	
	if(nums==null){
        sums = null;
      } 
    else if (nums.length == 0) {
        sums = new int[0];
      } 
    else {
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
        sums[i] = sums[i - 1] + nums[i];
      }
    }
 }

    public int sumRange(int i, int j) {
    	 if (sums == null) {
             return 0;
         }
         if (i >= sums.length || j >= sums.length || i > j) {
             return 0;
         } 
         else if (i == 0) {
             return sums[j];
         } 
         else {
             return sums[j] - sums[i - 1];
         }
     }
 }

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);