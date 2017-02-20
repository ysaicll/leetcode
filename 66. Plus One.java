public class Solution {
    public int[] plusOne(int[] digits) {
    int flag=0;   
    if(digits.length==1&&digits[0]==9)//数组只有一个9的话，flag就不起作用
    	return new int[]{1,0};
    digits[digits.length-1]++;
	for(int i=digits.length-1;i>0;i--)
        {	   
        	if(digits[i]==10)
        	{
        		flag=1;
        		digits[i-1]++;
        		digits[i]=0;
        	}      	
        }
	        if(digits[0]==10&&flag==1){
	        	digits[0]=0;
	        	int []new_dig=new int[digits.length+1];
	        	new_dig[0]=1;
	        	for(int j=1;j<digits.length+1;j++){
	        		new_dig[j]=digits[j-1];
	        	}
//	        	for(int w:new_dig)
//	        		System.out.print(w+",");
	        	return new_dig;
	        }
	        else {
//	        	for(int w:digits)
//	        		System.out.print(w+",");
				return digits;
			} 
    }
}