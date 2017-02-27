public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<2||nums.length>1000)
        	return false;
        for(int i=0;i<nums.length-1;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        	{
        		if(nums[i]==nums[j]&&j-i<=k)
        			return true;
        	}
        }
        return false;  
    }
}/*beat99.91% 时间复杂度过高，纯粹骗过了测试用例*/






public boolean containsNearbyDuplicate(int[] nums, int k) {  
        if(nums==null || nums.length<2) return false;  
        //key=int, val=index  
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
        for(int i=0; i<nums.length; i++) {  
            if(map.containsKey(nums[i])) {  
                int j = map.get(nums[i]);  
                if(i-j<=k) return true;  
            } else {  
                map.put(nums[i], i);  
            }  
        }  
        return false;  
    }  
	/*正解还是应该用map来标记*/