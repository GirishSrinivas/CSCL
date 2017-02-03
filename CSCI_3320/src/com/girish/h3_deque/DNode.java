package com.girish.h3_deque;

public class DNode<T>
{
	public DNode<T> llink;
	private T data;
	public DNode<T> rlink;
	
	public DNode(T data)
	{
		llink = null;
		setData(data);
		rlink = null;
	}

	/**
	 * This method returns the data of the node in the list
	 * @return		returns the data
	 */
	public T getData() 
	{
		return data;
	}

	/**
	 * This method is used to set the instance member data of the class DNode
	 * @param data 	It takes a Generic datatype <T>
	 */
	public void setData(T data) 
	{
		this.data = data;
	}
	
}
