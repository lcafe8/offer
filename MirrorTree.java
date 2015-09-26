package com.lcafe8.offer;

public class MirrorTree
{
	public static void Mirror(TreeNode root)
	{
		if (null == root)
			return;
		else
		{
			System.out.print(root.val + " ");
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			if (null != root.left)
				Mirror(root.left);
			if (null != root.right)
				Mirror(root.right);
		}
	}

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		TreeNode t5 = new TreeNode(6);

		t1.left = t2;
		t1.right = t4;

		t2.left = t5;
		t2.right = t3;

		System.out.print("Ô­¶þ²æÊ÷: ");
		HasChildTree.traveTree(t1);
		System.out.print("\n¶þ²æÊ÷¾µÏñ: ");
		MirrorTree.Mirror(t1);
	}
}
