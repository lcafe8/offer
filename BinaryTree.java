package com.lcafe8.offer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * @author Administrator
 * @date 2015年9月18日
 */
public class BinaryTree
{
	public TreeNode reConstructBinaryTree(int[] pre, int[] in)
	{
		//递归，前序第一个点就是根节点，中序根节点左边是左子树，右边是右子树
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
				//i-inStart-1是新in数组的长度，新pre数组终点是preStart+1 + i - inStart-1
				root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
				//i - inStart分开后左边数组长度，(i - inStart) + preStart + 1是新pre数组起点
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
