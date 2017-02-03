package com.girish.h3_deque;

public class DNode 
{
	public DNode llink;
	private int data;
	public DNode rlink;
	
	public DNode(int data)
	{
		llink = null;
		setData(data);
		rlink = null;
	}

	public int getData() 
	{
		return data;
	}

	public void setData(int data) 
	{
		this.data = data;
	}
	
}
