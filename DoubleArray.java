package com.lcafe8.offer;
/***
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author Administrator
 * @date 2015年9月18日
 */
public class DoubleArray
{
	public static boolean Find(int[][] array, int target)
	{
		//从左下角开始寻找，大于当前数，行减少；小于当前数，列增加。
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
