package com.girish.h3_deque;

import java.util.Scanner;

public class DequeTester 
{

	public static void main(String[] args) 
	{
		Deque d = new Deque();
		int choice = 0;
		int data = 0;
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Inject");
			System.out.println("4. Eject");
			System.out.println("5. Quit");
			System.out.print("Enter your choice: ");
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1: System.out.print("Enter a number to push: ");
						data = in.nextInt();
						d.push(data);
						break;
						
				case 2: d.pop();
						break;
						
				case 3: System.out.print("Enter a number to inject: ");
						data = in.nextInt();
						d.inject(data);
						break;
						
				case 4: d.eject();
						break;
						
				default:System.out.println("Program Terminated!!!");
						in.close(); 
						System.exit(0);
			}
		}

	}

}
