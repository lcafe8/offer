package com.lcafe8.offer;

import java.util.ArrayList;
import java.util.Iterator;

public class MatrixClockWise
{
	public static void printMatrixStart(int[][] matrix, int startX, int startY, ArrayList<Integer> list)
	{
		int row = matrix.length;
		int col = matrix[0].length;
		int endX = row - startX - 1;
		int endY = col - startY - 1;
		for (int i = startY; i <= endY; ++i)
		{
			list.add(matrix[startX][i]);
		}

		for (int j = startX + 1; j <= endX; ++j)
		{
			list.add(matrix[j][endY]);
		}
		if (startX != endX)
		{
			for (int k = endY - 1; k >= startY; --k)
			{
				list.add(matrix[endX][k]);
			}
		}
		if (startY != endY)
		{
			for (int l = endX - 1; l > startX; --l)
			{
				list.add(matrix[l][startY]);
			}
		}

	}

	public static ArrayList<Integer> printMatrix(int[][] matrix)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;
		int col = matrix[0].length;
		if (null == matrix || 0 >= row || 0 >= col)
			return null;
		int startX = 0;
		int startY = 0;

		while (row > startX * 2 && col > startY * 2)
		{
			printMatrixStart(matrix, startX, startY, list);

			startX++;
			startY++;
		}
		return list;
	}

	public static void main(String[] args)
	{
		int[][] matrix = {{1},{2},{3},{4},{5}};

		ArrayList<Integer> list = MatrixClockWise.printMatrix(matrix);

		if (null != list)
		{
			for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
			{
				System.out.print(iter.next() + " ");
			}
		}
	}
}
