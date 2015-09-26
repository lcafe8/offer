package com.lcafe8.offer;

/***
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * @author Administrator
 * @date 2015年9月20日
 */
public class RectCover
{
	public static void main(String[] args)
	{
		System.out.println(RectCover.cover(5));
	}

	public static int cover(int target)
	{
		if (0 == target)
			return 1;
		else if (target <= 2)
			return target;
		else
		{
			int result = 0, first = 1, second = 2;
			for (int i = 3; i <= target; i++)
			{
				result = first + second;
				first = second;
				second = result;
			}
			return result;
		}
	}
}
