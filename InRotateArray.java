package com.lcafe8.offer;

/***
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * 
 * @author Administrator
 * @date 2015年9月19日
 */
public class InRotateArray
{
	public static void main(String[] args)
	{
		int[] array = { 2, 2, 1, 2, 2, 2 };
		int min = InRotateArray.minNumberInRotateArray(array);
		System.out.println(min);
	}

	public static int minNumberInRotateArray(int[] array)
	{
		if (0 == array.length)
			return 0;
		if (array[array.length - 1] > array[0])
			return array[0];
		int min = array[array.length - 1];
		for (int i = array.length - 2; i >= 0; i--)
		{
			if (min >= array[i])
			{
				min = array[i];
			} else
			{
				break;
			}
		}
		return min;
	}
}
