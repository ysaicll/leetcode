public class Solution {
    public String reverseStr(String s, int k) {
         int len=s.length();
         int mod=len%(2*k);
         int t=len/(2*k);
         String res="";
         if(t>0){
         for(int i=0,j=0;i<len-mod;i++)
         {
        	 if((i+1)%(2*k)==0)
        		 j++;
        	 if(i>2*k*j-1&&i<2*k*j+k)
        		 res+=s.charAt(2*k*j+k-(i-2*k*j)-1);
        	 else
        	     res+=s.charAt(i);
         }
         if(mod<k)
         {
        	 for(int i=len-1;i>len-mod-1;i--)
        	 res+=s.charAt(i);
         }
        	
         if(mod==k)
         {
        	 for(int i=len-1;i>len-mod-1;i--)
        		 res+=s.charAt(i);
         }
         if(mod>k)
         {
        	 for(int i=len-(mod-k)-1;i>len-mod-1;i--)
        		 res+=s.charAt(i);
        	 res+=s.substring(len-(mod-k),len);
         }
         }
         else {
        	 if(len<k)
        	 {
            	 for(int i=len-1;i>-1;i--)
            	 res+=s.charAt(i);
             }
        	 if(len==k)
             {
            	 for(int i=len-1;i>-1;i--)
            		 res+=s.charAt(i);
             }
             if(len>k)
             {
            	 for(int i=k-1;i>-1;i--)
            		 res+=s.charAt(i);
            	 res+=s.substring(k,len);
             }            
		}
       return res;
    }
}
//³¬Ê±¡£¡£¡£