public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int res[]=new int[findNums.length];
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)              //把主数组放到map(因为数组是不重复的)里标记好
        	map.put(nums[i], i);
        for(int i=0;i<findNums.length;i++)         //将子数组中的各元素对应到主数组中
        {
        	int k=map.get(findNums[i]);             //从主数组的特定位置(map中已经对应)开始遍历，节省开销
        	if(k==nums.length-1)
        		res[i]=-1;
        	for(int j=k;j<nums.length;j++)
        	{
        		if(nums[j]>findNums[i]){
        			res[i]=nums[j];
        		    break;
        		}
        		else
        			res[i]=-1;
        	}
        }
       // System.out.println(Arrays.toString(res));
        return res;
    }
}
/beat 88%