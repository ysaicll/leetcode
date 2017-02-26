public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
       for(int i=0;i<m;i++)
       {
        	nums.add(nums1[i]);
       }
       for(int i=0;i<n;i++)
        {
        	nums.add(nums2[i]);
        }
	    for(int i=0;i<nums.size();i++)
	    {
	    	nums1[i]=nums.get(i);
	    }
            Arrays.sort(nums1);
    }
}