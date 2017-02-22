/*getMin()未满足常数时间完成，需改进*/
public class MinStack {
ArrayList<Integer> list=new ArrayList<Integer>(); 
    public MinStack() {    	
    }   
    public void push(int x) {
        list.add(x);       
    }    
    public void pop() {  		
        list.remove(list.size()-1);            
    }
    
    public int top() {
    	 return list.get(list.size()-1);
    }
    
    public int getMin() {
    	int min=Integer.MAX_VALUE;    	
    	for (int i = 0; i < list.size(); i++)
        {
    		
    		if(list.get(i)<min)		
    		   min=list.get(i); 				
		}
        return min;
   }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */