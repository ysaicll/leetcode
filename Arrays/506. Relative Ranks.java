public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if(nums.length==0)
        	return null;
	    String res[]=new String[nums.length];
        Map<Integer, Integer>map=new HashMap<>();      //map标记排序前后数组的相对位置
        for(int i=0;i<nums.length;i++)
        	map.put(nums[i],i );
        Arrays.sort(nums);
        if(nums.length==1){                            //只有1,2,3名运动员的情况特殊考虑
        res[map.get(nums[nums.length-1])]="Gold Medal";      
        return res;
        }
        if(nums.length==2){
        res[map.get(nums[nums.length-1])]="Gold Medal";
        res[map.get(nums[nums.length-2])]="Silver Medal";
        return res;
        }
        if(nums.length==3){
        res[map.get(nums[nums.length-1])]="Gold Medal";
        res[map.get(nums[nums.length-2])]="Silver Medal";
        res[map.get(nums[nums.length-3])]="Bronze Medal";
        return res;
        }
        res[map.get(nums[nums.length-1])]="Gold Medal";
        res[map.get(nums[nums.length-2])]="Silver Medal";
        res[map.get(nums[nums.length-3])]="Bronze Medal";
        for(int i=nums.length-4;i>=0;i--)
        	res[map.get(nums[i])]=Integer.toString(nums.length-i);
        //System.out.println(Arrays.toString(res));
        return res;
    }
}