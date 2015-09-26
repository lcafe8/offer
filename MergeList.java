package com.lcafe8.offer;

public class MergeList
{
	// µÝ¹é
	public static ListNode Merge1(ListNode list1, ListNode list2)
	{
		if (null == list1)
			return list2;
		else if (null == list2)
			return list1;
		else
		{
			ListNode result = null;
			if (list1.val < list2.val)
			{
				result = list1;
				result.next = Merge(list1.next, list2);
			} else
			{
				result = list2;
				result.next = Merge(list1, list2.next);
			}
			return result;
		}
	}

	// ·ÇµÝ¹é
	public static ListNode Merge(ListNode list1, ListNode list2)
	{
		if (null == list1)
			return list2;
		else if (null == list2)
			return list1;
		else
		{
			ListNode result = null;
			ListNode list3 = null;
			while (null != list1 && null != list2)
			{
				if (list1.val < list2.val)
				{
					if (null == list3)
					{
						list3 = list1;
						result = list3;
					} else
					{
						list3.next = list1;
						list3 = list3.next;
					}
					list1 = list1.next;
				} else
				{
					if (null == list3)
					{
						list3 = list2;
						result = list3;
					} else
					{
						list3.next = list2;
						list3 = list3.next;
					}
					list2 = list2.next;
				}
			}
			if (null != list1)
			{
				list3.next = list1;
			}
			if (null != list2)
			{
				list3.next = list2;
			}
			return result;
		}
	}

	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(5);
		node1.next = node2;
		ListNode node3 = new ListNode(7);
		node2.next = node3;
		ListNode node4 = new ListNode(8);
		node3.next = node4;

		ListNode l1 = node1;
		while (null != l1)
		{
			System.out.print(l1.val + " ");
			l1 = l1.next;
		}

		System.out.println();

		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(4);
		list2.next = list3;
		ListNode list4 = new ListNode(9);
		list3.next = list4;
		ListNode list5 = new ListNode(11);
		list4.next = list5;

		ListNode l2 = list2;
		while (null != l2)
		{
			System.out.print(l2.val + " ");
			l2 = l2.next;
		}

		System.out.println();

		ListNode listNode = MergeList.Merge(node1, list2);

		while (null != listNode)
		{
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
	
//		System.out.println();
//		ListNode listNode2 = MergeList.Merge1(node1, list2);
//
//		while (null != listNode2)
//		{
//			System.out.print(listNode2.val + " ");
//			listNode2 = listNode2.next;
//		}
	}
}