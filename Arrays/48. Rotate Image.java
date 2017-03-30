public class Solution {
    public void rotate(int[][] matrix) {
     if (matrix.length==0)
		 matrix=null;
     int [][]temp=new int[matrix.length][matrix.length];
     for(int i=0;i<matrix.length;i++)
     {
    	 for(int j=0;j<matrix.length;j++)
    	 {
    		 temp[i][j]=matrix[matrix.length-j-1][i];   
    	 }
      }   
     for(int i=0;i<matrix.length;i++)
     {
    	 for(int j=0;j<matrix.length;j++)    	   		 
     		 matrix[i][j]=temp[i][j];   	 
      }   
    }
}
//暴力破解效率低