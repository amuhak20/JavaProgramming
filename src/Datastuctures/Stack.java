package Datastuctures;

public class Stack {

	int maxSize=100;
	int top;
	int stackArray[];
	
	Stack()
	{
		top=-1;
		stackArray= new int[maxSize];
	}
	
	void push(int x)
	{
		stackArray[++top]=x;
		System.out.println("Value pushed successfully" +x);
	}
	int pop()
	{
		if(isEmpty()) {
			return -1;
		}
		else
		{
		int x=stackArray[top--];
		System.out.println("Value popped successfully" +x);
		return x;
		}
	}
	int peek()
	{
		if(isEmpty()) {
			return -1;
		}
		else
		{
		int x=stackArray[top];
		System.out.println("Value peeked successfully" +x);

		return x;
		}
		
	}
	
	boolean isEmpty()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
		return true;
		}
		else
		{
			 return false;
		}
	}
	
	boolean isFull()
	{
		if(top>=maxSize-1)
		{
			System.out.println("Stack overrflow");
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.peek();
		st.pop();
	}
	
}
