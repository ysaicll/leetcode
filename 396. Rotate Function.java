public class Solution {
    public int maxRotateFunction(int[] A) {
     if(A.length==0||A.length==1)      //数组为空或长度为一，则返回0
    	return 0;
        int[] m_arr=new int[A.length];  //新建与原数组等长的数组，用来存放F(x)
    	int f=0;
    	for(int i=0;i<A.length;i++)    
    	{
    		for(int k1=0;k1<=(A.length-2)/2;k1++)  //先翻转前n-1个数组成员
    	    	{
    	    		int temp=A[k1];
    	    		A[k1]=A[(A.length-2)-k1];
    	    		A[(A.length-2)-k1]=temp;
    	    	}
    		for(int k1=0;k1<=(A.length-1)/2;k1++) //再翻转所有数组成员来实现clock访问
	    	{
	    		int temp=A[k1];
	    		A[k1]=A[(A.length-1)-k1];
	    		A[(A.length-1)-k1]=temp;
	    	}    		
    		for(int j=0;j<A.length;j++)
    	     	f=f+j*A[j];
    		    m_arr[i]=f;
    		    f=0;
    	}
    	Arrays.sort(m_arr);
  //  	System.out.println(m_arr[m_arr.length-1]);
    	return m_arr[m_arr.length-1];
    }
}