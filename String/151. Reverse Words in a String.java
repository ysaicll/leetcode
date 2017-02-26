public class Solution {
    public String reverseWords(String s) {
        if (s.equals(""))                 //考虑空串
        	return "";
        String[] arr=s.trim().split(" ");
        String str="";
        for(int i=arr.length-1;i>-1;i--)
        {
            if(!arr[i].equals(""))     //考虑单词之间有很多空格
        	str+=arr[i]+" ";
        }
//        System.out.println(str.trim());
        return str.trim();
    }
}