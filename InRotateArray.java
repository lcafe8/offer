package com.lcafe8.offer;

/***
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ����е�һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * 
 * @author Administrator
 * @date 2015��9��19��
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
