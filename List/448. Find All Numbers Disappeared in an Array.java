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
/*����һ��Arraylistȫ��Ϊ0��
����ԭ���飬����Ӧ���ֱ굽Arraylist�Ķ�Ӧλ�ã�
��Щ����Ϊ0�ĵط���������ȱʧ�����֣�
������һ�����齫���ǵ��±����*/