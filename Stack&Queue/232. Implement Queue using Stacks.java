public class MyQueue {
    /** Initialize your data structure here. */
	Stack<Integer>stack1=new Stack<>();
	Stack<Integer>stack2=new Stack<>();
    public MyQueue() {}   
    /** Push element x to the back of queue. */
    public void push(int x) {  	                 //在push的时候栈顶元素就当成队首，新入元素调入栈底作为队尾	
        while(!stack1.empty())
        {
        	stack2.push(stack1.peek());
        	stack1.pop();
        }
        stack1.push(x);
        while(!stack2.empty())
        {
        	stack1.push(stack2.peek());
        	stack2.pop();
        }
    }   
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {  	 
         int head=stack1.peek();
         stack1.pop();
         return head;
    }
    
    /** Get the front element. */
    public int peek() {
        return stack1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */