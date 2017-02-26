public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> list =new ArrayList<Integer>();
        List<Integer> list1 =new ArrayList<Integer>();        
        for(int i=0;i<nums.length;i++)
        	list.add(0);
        for(int i=0;i<nums.length;i++)        
        {
        	list.set(nums[i]-1, nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
        	if(list.get(j)==0)
        		list1.add(j+1);	
           
        }
        return list1;
    }
}
/*申请一个Arraylist全标为0；
遍历原数组，将对应数字标到Arraylist的对应位置；
那些依旧为0的地方就是数组缺失的数字；
再用另一个数组将他们的下标输出*/