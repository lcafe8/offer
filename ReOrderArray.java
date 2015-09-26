package com.lcafe8.offer;

public class ReOrderArray
{
	public static void reArray1(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = array.length - 1; j > i; j--)
			{
				if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) // 前偶后奇交换
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		for (int i : array)
		{
			System.out.print(i + " ");
		}
	}

	public static void reArray(int[] array)// 没有位置顺序要求
	{
		int pre = 0;
		int end = array.length - 1;
		while (pre < end)
		{
			if (0 != (array[pre] % 2))
			{
				pre++;
			} else
			{
				while (0 == (array[end] % 2))
				{
					end--;
				}
				int temp = array[pre];
				array[pre] = array[end];
				array[end] = temp;
			}
		}
		for (int i : array)
		{
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] array = { 6, 7, 2, 5, 8, 9, 4 };
		ReOrderArray.reArray1(array);
	}
}
