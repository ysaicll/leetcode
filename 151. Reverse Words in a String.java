public class Solution {
    public String reverseWords(String s) {
        if (s.equals(""))                 //���ǿմ�
        	return "";
        String[] arr=s.trim().split(" ");
        String str="";
        for(int i=arr.length-1;i>-1;i--)
        {
            if(!arr[i].equals(""))     //���ǵ���֮���кܶ�ո�
        	str+=arr[i]+" ";
        }
//        System.out.println(str.trim());
        return str.trim();
    }
}