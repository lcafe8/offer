package com.lcafe8.offer;

/***
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author Administrator
 * @date 2015年9月19日
 */
public class JumpFloor2
{
	public static void main(String[] args)
	{
		System.out.println(JumpFloor2.Count(20));
		System.out.println(JumpFloor2.Count2(20));
		System.out.println(JumpFloor2.count3(20));
	}

	public static int count3(int target)
	{
		if (0 == target)
			return 0;
		else if (1 == target)
			return 1;
		else
		{
			return 2 << (target-2);
		}
	}
	
	public static int Count2(int target)
	{
		if (0 == target)
			return 0;
		else if (1 == target)
			return 1;
		else
		{
			return 2*Count2(target-1);
		}
	}
	
	public static int Count(int target)
	{
		int[] arr = new int[target];
		if (0 == target)
			return 0;
		else if (1 == target)
			return 1;
		else if (2 == target)
			return 2;
		else
		{
			arr[0] = 1;
			arr[1] = 2;
			for (int i = 3; i <= target; i++)
			{
				for (int j = i - 2; j >= 0; j--)
				{
					arr[i - 1] += arr[j];
				}
				arr[i - 1] += 1;
			}
			return arr[target - 1];
		}
	}
}
