public class Solution {
    public void moveZeroes(int[] nums) {
        //ֻ�е�iָ��Ϊ��0ʱ����ji��ͬʱ��j���ƣ���j�������ĳ�i��������
        //��ʹi��������Ϊ0��ijͬ�����ƣ�����iָ��Ϊ0ʱ��ֻ��i���ƣ�j��Ȼָ��0��
		int i,j=0;
		for ( i = 0; i < nums.length; i++) {
              if(nums[i]!=0){
            	  if(j!=i){
            		  nums[j]=nums[i];
            		  nums[i]=0;           		  
            	  }
            	  j++;
             }
        }
    }
}