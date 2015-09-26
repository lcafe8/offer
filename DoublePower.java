package com.lcafe8.offer;


public class DoublePower
{
	public static double Power(double base, int exponent)
	{
		//return Math.pow(base, exponent);
		double sum = 1;
		if (0 == exponent)
		{
			return 1;
		} else if (exponent > 0)
		{
			for (int i = 0; i < exponent; i++)
			{
				sum *= base;
			}
		} else
		{
			for (int i = 0; i < (-exponent); i++)
			{
				sum *= 1 / base;
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(DoublePower.Power(2, -3));
	}
}
