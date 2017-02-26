public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     int n1_len=nums1.length;
     int n2_len=nums2.length;
     for(int i=0;i<n1_len;i++)
     {
    	 for(int j=0;j<n2_len;j++)
    	 {
    		 if(nums1[i]==nums2[j]&&!list.contains(nums1[i])) //如果list不包含交叉值，才add，避免重复
    		 list.add(nums1[i]); 
    	 }
     }
     int []nums=new int[list.size()];
     for(int i=0;i<list.size();i++)
     {
    	nums[i]=list.get(i);
     }
      return nums;
    }
}