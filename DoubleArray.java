package com.lcafe8.offer;
/***
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author Administrator
 * @date 2015��9��18��
 */
public class DoubleArray
{
	public static boolean Find(int[][] array, int target)
	{
		//�����½ǿ�ʼѰ�ң����ڵ�ǰ�����м��٣�С�ڵ�ǰ���������ӡ�
		int r = array.length - 1;
		int i = 0;
		while (r >= 0 && i < array[0].length)
		{
			if (array[r][i] > target)
				r--;
			else if (array[r][i] < target)
				i++;
			else
				return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[][] array ={{2,3,4},{5,6,7},{8,9,10}};
		
		System.out.println(Find(array, 5));
	}
}
