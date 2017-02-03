package com.girish.h3_deque;

public class Deque 
{
	private DNode first;
	private DNode last;
	
	/**
	 * Constructor of class Deque 
	 */
	public Deque()
	{
		first = null;
		last = null;
	}
	
	
	/**
	 * This method pushes data in front of the deque
	 * @param data An integer data which is being pushed on the front of the deque.
	 */
	public void push(int data)
	{
		DNode p = new DNode(data);
		
		if(first == null && last == null)
		{
			first = p;
			last = p;
		}
		else
		{
			p.rlink = first;
			first.llink = p;
			first = p;
		}
		System.out.print("Current Deque: ");
		display();
	}
	
	
	/**
	 * This method removes the data from the front of the deque 
	 * @return 		The data from the front of the deque.
	 */
	public int pop()
	{
		int data = -1;
		
		if(first == null)
		{
			System.out.println("Deque is empty, Nothing to pop!");
		}
		else
		{
			data = first.getData();
			first = first.rlink;
			
			if(first != null)
			{
				first.llink = null;
			}
			
			System.out.print("Current Deque: ");
			display();
		}
		return data;
	}
	
	
	/**
	 * This method inserts the data to the back of the deque.
	 * @param data An integer data which is being inserted on the back of the deque.
	 */
	public void inject(int data)
	{
		DNode p = new DNode(data);
		
		if(first == null && last == null)
		{
			first = p;
			last = p;
		}
		else
		{
			last.rlink = p;
			p.llink = last;
			last = p;
		}
		
		System.out.print("Current Deque: ");
		display();
	}
	
	
	/**
	 * This method removes the data from the rear end of the deque
	 * @return 		the item which is removed from the rear end of the deque.
	 */
	public int eject()
	{
		int data = -1;
		
		if(last == null)
		{
			System.out.println("Deque is empty, Nothing to eject!");
		}
		else
		{
			data = last.getData();
			last = last.llink;
			
			if(last != null)
			{
				last.rlink = null;
			}
			
			System.out.print("Current Deque: ");
			display();
		}
		return data;
	}
	
	/**
	 * This method prints every element in the deque.
	 */
	public void display()
	{
		DNode cur = first;
		if(cur == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(cur != null)
			{
				System.out.print(cur.getData() +" ");
				cur = cur.rlink;
			}
			System.out.println();
		}
	}
}
