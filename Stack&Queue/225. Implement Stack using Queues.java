public class MyStack {
	  /** Initialize your data structure here. */
	Queue<Integer>queue=new LinkedList<Integer>();
	Queue<Integer>temqueue=new LinkedList<Integer>();
       //��ʱ������������ԭ���е���Ϣ
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);       
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(queue.size()==1)
    		return queue.poll();
    	int size=queue.size();
    	int top=0;   	
    	for(int i=0;i<size-1;i++)
    		temqueue.offer(queue.poll());//Ԫ��ȫ�����ӣ�ֻ���¶�β       
        	top=queue.poll();       
        for(int i=0;i<size-1;i++)
    		queue.offer(temqueue.poll());           
        return top;
    }
    
    /** Get the top element. */
    public int top() {
    	if(queue.size()==1)
    		return queue.element();
    	int size=queue.size();
    	int top=0;   	
    	for(int i=0;i<size-1;i++)    	
    		temqueue.offer(queue.poll());            	    	
    		top=queue.poll();      	
        for(int i=0;i<size-1;i++)
    		queue.offer(temqueue.poll());
            queue.offer(top);
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
       return queue.isEmpty(); 
    }
}
/*�ؼ����ڱ���ԭ�еĶ�����Ϣ���������ݣ����ȵ�*/
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */