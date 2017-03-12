public class Solution {
    public boolean isValid(String s) {
       Stack<Character>stack=new Stack<>();
       Map<Character, Character>match=new HashMap<>();
       String paren="({[";
       if(s.charAt(0)=='}'||s.charAt(0)==')'||s.charAt(0)==']')
    	   return false;
       match.put(')','(');                 //map���������ж�ջ��Ԫ���Ƿ���Ժ�������Ԫ��ƥ�����ջ
       match.put(']','[');
       match.put('}','{');
       for(int i=0;i<s.length();i++)
       {
    	   if(stack.size()==0)
    		   stack.push(s.charAt(i));
    	   else {
    		   if(paren.contains(s.charAt(i)+"")||stack.peek()!=match.get(s.charAt(i)))
        		   stack.push(s.charAt(i));
        	   else if(stack.peek()==match.get(s.charAt(i)))
    				stack.pop();
		  }	   
       }
       if(stack.size()==0)
    	   return true;
       else
    	   return false;
    }
}
/*��Ҫ˼�������ջȥƥ�䣬�����ر�ע��ջ�յ����*/