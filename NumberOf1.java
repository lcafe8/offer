package com.lcafe8.offer;

public class NumberOf1
{
	public static int numberCount(int n)
	{
		int count = 0;
		while(0 != n)
		{
			n = n & (n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(NumberOf1.numberCount(7));
	}
}
