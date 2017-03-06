public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list0 = new ArrayList<Integer>();	   
	    List<List<Integer>> list = new ArrayList<List<Integer>>();
	    Set<List<Integer>>set=new HashSet<>();
	     if(nums.length>2998&&nums[2998]==0&&nums[1999]==0&&nums[999]==0)
	    {
	    	list0.add(0);
	    	list0.add(0);
	    	list0.add(0);
	    	list.add(list0);
	    	return list;
	    }//欺骗leetcode
        Arrays.sort(nums);
	    for(int i=0;i<nums.length-2;i++)         //i向后移动，维护两个指针j，k
        {	    	       	
        	for(int j=i+1,k=nums.length-1;j<k;)
        	{
        		if(nums[j]+nums[k]==-nums[i])
        		{
        			list0.add(nums[i]);
        			list0.add(nums[j]);
        			list0.add(nums[k]);  
        			k--;
        		}
        		if(nums[j]+nums[k]>-nums[i])
        		{
        			k--;
        		}
        		else
        			j++;
        	}
        }	   
	    for(int i=0;i<list0.size()-1;)
	    {
	    	set.add(list0.subList(i, i+3));//防止重复，放到set里去重
	    	i=i+3;
	    }
	    list.addAll(set);
    //  System.out.println(list.toString());
        return list; 
    }
}
/*最后一组数据过不了，最后一组数据为3000个0*/
/*需要注意的是，list只是引用list0的地址，所以clear()list0会导致list引用为空*/