package com.lcafe8.offer;

/***
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 * 
 * @author Administrator
 * @date 2015��9��19��
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
