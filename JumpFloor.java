package com.lcafe8.offer;

/***
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author Administrator
 * @date 2015年9月19日
 */
public class JumpFloor
{
	public static void main(String[] args)
	{
		System.out.println(JumpFloor.Count(5));
	}

	public static int Count(int target)
	{
		int result = 0, first = 1, second = 2;
		if (0 == target)
			return 0;
		else if (1 == target)
			return 1;
		else if (2 == target)
			return 2;
		else
		{
			for (int i = 3; i <= target; i++)
			{
				result = first + second;
				first = second;
				second = result;
			}
		}
		return result;
	}
}
