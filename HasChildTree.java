package com.lcafe8.offer;

public class HasChildTree
{
	public static boolean isChildTree(TreeNode tree1, TreeNode tree2)
	{
		if (null == tree2)
			return true;
		if (null == tree1)
			return false;
		if (tree1.val != tree2.val)
			return false;
		return isChildTree(tree1.left, tree2.left) && isChildTree(tree1.right, tree2.right);
	}

	public static boolean HasSubtree(TreeNode tree1, TreeNode tree2)
	{
		boolean flag = false;
		if(null != tree1 && null == tree2)
        {
            flag = false;
        }
		if (null != tree1 && null != tree2)
		{
			if (tree1.val == tree2.val)
			{
				flag = isChildTree(tree1, tree2);
			}
			if (!flag)
				flag = HasSubtree(tree1.left, tree2);
			if (!flag)
				flag = HasSubtree(tree1.right, tree2);
		}
		return flag;
	}

	public static void traveTree(TreeNode tree)
	{
		if (null == tree)
			return;
		else
		{
			System.out.print(tree.val+" ");
			if (null != tree.left)
				traveTree(tree.left);
			if (null != tree.right)
				traveTree(tree.right);
		}
	}

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		TreeNode t5 = new TreeNode(6);

		t1.left = t2;
		t1.right = t4;

		t2.left = t5;
		t2.right = t3;

		HasChildTree.traveTree(t1);

		System.out.println(HasChildTree.HasSubtree(t1, t2));
	}
}
