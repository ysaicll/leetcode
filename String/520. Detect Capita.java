public class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.length()==1||word.length()==0)
    	  return true;
      String s=word.charAt(0)+"";
	  if(word.matches("[A-Z]+")==true||word.matches("[a-z]+")==true)//����������ʽƥ���Ƿ�ȫΪ��д��Сд��ע��������ʽ���÷�
		  return true;
	  else if(s.matches("[A-Z]+")==true&&word.substring(1).matches("[a-z]+")==true)
		  return true;
	 
        return false; 
    }
}