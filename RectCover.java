package com.lcafe8.offer;

/***
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * 
 * @author Administrator
 * @date 2015��9��20��
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
