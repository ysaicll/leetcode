/*正向思维：reach是一个在i到 i + nums[i]之间的数，如果他足够大，那么它就可以超过数组的长度
这样就能避免i=i+nums[i]直接跳过了这个数，如[2，5，0，0]直接0+2就跳过了5，导致判断出错*/
public class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;  
        int i = 0;  
        for ( ; i < nums.length && i <= reach; i++)
			{  
            reach = Math.max(reach, i + nums[i]);  
            }  
        return (i == nums.length); 
    }
}
==================================================================================================
/*逆向思维：last指向数组的倒数第二个数，如果倒数第二个数能够保证跳到最后一个数，last就前移，如果last最后能够回到index=0处，
证明可以正常跳*/

public class Solution {
    public boolean canJump(int[] nums) {
        int last =  nums.length - 1;  
        for (int i =  nums.length - 2; i >= 0; i--) 
        {  
         if (i +  nums[i] >= last) 
         {  
            last = i;  
         }  
       }  
    return (last== 0); 
    }
}