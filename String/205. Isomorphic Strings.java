public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0||s.length()==1)
        	return true;
        Map<Character, Character> map = new HashMap<Character, Character>();  
        Set<Character> set = new HashSet<Character>();  //set������ģ��Ҳ������ظ�
          
        for(int i=0; i<s.length(); i++) {  
            char c1 = s.charAt(i);  
            char c2 = t.charAt(i);  
              
            if(map.containsKey(c1))     //c1��ӳ��ֵ
            {  
                if(map.get(c1) != c2)  //����c1��ӳ��ֵ����c2��˵������Ӧ
                return false;  
            } 
            else 
            {  
                if(set.contains(c2)) //c2�Ѿ��浽set�����ˣ�����map����û��ӳ��c2��˵������Ӧ
                return false;  
              
                else 
                {  
                    map.put(c1, c2); //map����ӳ�䣬set�о���Ԫ�� 
                    set.add(c2);  
                }  
            }  
        }  
        return true;  
    }
}