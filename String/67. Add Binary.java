public class Solution {
    public String addBinary(String a, String b) {
         int a_len=a.length();
         int b_len=b.length();
         int max_len=Math.max(a_len, b_len);
	     if(a_len<=b_len)                            //�Ȳ��벻��ȵ��ַ���
           {
    	       for(int i=0;i<b_len-a_len;i++)
    		      a="0"+a;
           }
	     if(a_len>b_len)
	       {
	           for(int i=0;i<a_len-b_len;i++)
	    	      b="0"+b;
	       }
	     String sum="";
	     int flag=0;                                //ָʾ�Ƿ��н�λ
	     for(int i=max_len-1;i>-1;i--)
	     {
	    	 
	    	 if((int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')+flag==2)  //ͬλ����Ƿ��н�λ
	    	 {	    		     		
	    		flag=1;
	    		sum="0"+sum;
	    		continue;
	    	 }
	    	 if((int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')+flag>2)
	    	 {	    		     		
	    		flag=1;
	    		sum="1"+sum;
	    		continue;
	    	 }
	    	 if((int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')+flag==0)
	    	 {	    		     		
	    		flag=0;
	    		sum="0"+sum;
	    		continue;
	    	 }
	    	 else
	    	 {
	    		flag=0; 
	    		sum="1"+sum;
	    		continue;
	    	 }	    	 
	     }
	     if((int)(a.charAt(0)-'0')+(int)(b.charAt(0)-'0')+flag>=2)  //��λ�Ƿ��һ
    		 sum="1"+sum; 
    		 return sum;
    }
}