package com.lcafe8.offer;

public class FibonacciTest
{
	public static void main(String[] args)
	{
		System.out.println(FibonacciTest.Fibonacci(9));
	}

	public static int Fibonacci(int n)
	{
		int first = 0,second =1,result=0;
		if(0 == n)
			return 0;
		else if(1 == n)
			return 1;
		else
		{
			for(int i = 2; i<=n;i++)
			{
				result = first + second;
				first = second;
				second = result;
			}
		}
		return result;
	}
}
