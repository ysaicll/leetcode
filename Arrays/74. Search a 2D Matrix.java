public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0||target<matrix[0][0])
        	return false;
	    int[]temp=new int[matrix.length];
	    int j=0,flag=0;
	    if(matrix.length==1)    //二维数组只有一行的话直接将flag置为1去比较
	    	flag=1;
        for(int i=0;i<matrix.length;i++)//有多行的话就每行的第一个数放到一个临时数组
        {
        	temp[i]=matrix[i][0];
        }
        for(int i=0;i<temp.length-1;i++)
        {
        	if(target>=temp[i]&&target<temp[i+1])
        	{
        		j=i;
        		flag=1;
        		break;
        	}
        	else if(i==temp.length-2&&temp[i+1]<=target)
        	{
        		j=i+1;
        		flag=1;
        	}
        }
        if(flag==1)   //二分查找看看目标行是否有target
        {
        	int low=0,high=matrix[0].length-1,mid=(low+high)/2;
        	for(int i=0;i<matrix[0].length;i++)
        	{
        		
        		if(matrix[j][mid]==target)
        			return true;
        		if(matrix[j][mid]<target)
        		{
        			low=mid+1;
        			mid=(low+high)/2;
        		}	
        		else {
        			high=mid-1;
        			mid=(low+high)/2;
				}
        	}
        }
        return false;  
    }
}
/*总体思想就是把二维数组拆开，以每行的第一个数来作为标记物，这样就能确定target在哪一行（如果存在的话），
就是判断过程有点烦，要O(3n)复杂度*/