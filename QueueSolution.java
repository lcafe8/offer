package com.lcafe8.offer;

import java.util.Stack;
/***
 * 两个栈实现队列
 * @author Administrator
 * @date 2015年9月19日
 */
public class QueueSolution
{
	public static void main(String[] args)
	{
		MyQueue q = new MyQueue();

		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		q.push(4);
		System.out.println(q.pop());
		
		q.push(5);
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}

class MyQueue
{
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node)
	{
		stack1.push(node);
	}

	public int pop()
	{
		if (0 != stack2.size())
			return stack2.pop();

		else
		{
			while (0 != stack1.size())
			{
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
	}
}
