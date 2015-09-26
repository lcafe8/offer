package com.lcafe8.offer;

/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö������� ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * @author Administrator
 * @date 2015��9��18��
 */
public class BinaryTree
{
	public TreeNode reConstructBinaryTree(int[] pre, int[] in)
	{
		//�ݹ飬ǰ���һ������Ǹ��ڵ㣬������ڵ���������������ұ���������
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd)
	{
		if (preStart > preEnd || inStart > inEnd)
			return null;
		TreeNode root = new TreeNode(pre[preStart]);
		for (int i = inStart; i <= inEnd; i++)
		{
			if (pre[preStart] == in[i])
			{
				//i-inStart-1����in����ĳ��ȣ���pre�����յ���preStart+1 + i - inStart-1
				root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
				//i - inStart�ֿ���������鳤�ȣ�(i - inStart) + preStart + 1����pre�������
				root.right = reConstructBinaryTree(pre, i - inStart + preStart + 1, preEnd, in, i + 1, inEnd);
			}
		}
		System.out.print(root.val + " ");
		return root;
	}

	public static void main(String[] args)
	{
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };

		BinaryTree b = new BinaryTree();
		b.reConstructBinaryTree(pre, in);
	}
}

/**
 * Definition for binary tree
 */
class TreeNode
{
	int val;
	TreeNode left = null;
	TreeNode right =null;

	TreeNode(int x)
	{
		val = x;
	}
}
