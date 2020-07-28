package Datastuctures;

import java.util.EmptyStackException;

public class StackRev {

	int top;
	int maxSize=100;
	int[] stackArray;
	public StackRev() {
		super();
		top = -1;
		maxSize = 100;
		stackArray = new int[maxSize];
	}
	
	boolean isEmplty()
	{
		if(top<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isFull()
	{
		if(top==maxSize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void push(int n)
	{
		try
		{
			if(isFull())
			{
				
			}
			else
			{
		stackArray[++top]=n;
			}
		}
		catch(StackOverflowError e)
		{
			System.out.println("Stack is full" +e.getStackTrace());
		}
		
	}
	int pop()
	{
		int a=0;
		try
		{
			if(isEmplty())
			{
			System.out.println("Stack is empty");
			}
			else
			{
			 a=stackArray[top];
			top--;
			}
		}
		catch(EmptyStackException e)
		{
			
			System.out.println("Stack is empty" +e.getStackTrace());
			
		}
		return a;

	}
	
	public static void main(String[] args) {
		StackRev rev = new StackRev();
		rev.push(1);
		rev.push(2);
		rev.push(3);
		
		while(!rev.isEmplty())
		{
		System.out.print(rev.pop());
		}

		
	}
	
}
