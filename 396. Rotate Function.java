public class Solution {
    public int maxRotateFunction(int[] A) {
     if(A.length==0||A.length==1)      //����Ϊ�ջ򳤶�Ϊһ���򷵻�0
    	return 0;
        int[] m_arr=new int[A.length];  //�½���ԭ����ȳ������飬�������F(x)
    	int f=0;
    	for(int i=0;i<A.length;i++)    
    	{
    		for(int k1=0;k1<=(A.length-2)/2;k1++)  //�ȷ�תǰn-1�������Ա
    	    	{
    	    		int temp=A[k1];
    	    		A[k1]=A[(A.length-2)-k1];
    	    		A[(A.length-2)-k1]=temp;
    	    	}
    		for(int k1=0;k1<=(A.length-1)/2;k1++) //�ٷ�ת���������Ա��ʵ��clock����
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