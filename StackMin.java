package com.lcafe8.offer;

import java.util.Stack;
import java.util.TreeSet;

public class StackMin
{
	private Stack<Integer> stack = new Stack<Integer>();
	private int min = 0;
	private static TreeSet<Integer> set = new TreeSet<Integer>();

	public void push(int node)
	{
		stack.add(node);
		set.add(node);
		if (1 == stack.size())
			min = node;
		else if (min > node)
			min = node;
	}

	public void pop()
	{
		if (null != stack)
		{
			if (stack.size() > 1)
			{
				if (min == stack.peek())
				{
					set.remove(stack.peek());
					stack.pop();
					min = set.first();
				} else
				{
					stack.pop();
				}
			}
			if (0 == stack.size())
				min = 0;
		}
	}

	public int top()
	{
		return stack.peek();
	}

	public int min()
	{
		if (null == stack)
			return 0;
		return this.min;
	}

	public static void main(String[] args)
	{
		StackMin s = new StackMin();

		s.push(3);
		System.out.print(s.min() + " ");
		s.push(4);
		System.out.print(s.min() + " ");
		s.push(2);
		System.out.print(s.min() + " ");
		s.push(3);
		System.out.print(s.min() + " ");
		s.pop();
		System.out.print(s.min() + " ");
		s.pop();
		System.out.print(s.min() + " ");
		s.pop();
		System.out.print(s.min() + " ");
		s.push(0);
		System.out.println(s.min());

	}
}
