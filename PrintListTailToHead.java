package com.lcafe8.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/***
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * @author Administrator
 * @date 2015年9月18日
 */
public class PrintListTailToHead
{
	public ListNode findKthToTail2(ListNode head, int k)
	{
		if (null == head || 0 >= k)
		{
			return null;
		}
		ListNode lastnode = head;
		for (int i = 1; i < k; i++)
		{
			if (head.next != null)
			{
				head = head.next;
			} else
			{
				return null;
			}
		}
		while (head.next != null)
		{
			head = head.next;
			lastnode = lastnode.next;
		}
		return lastnode;
	}

	public ListNode findKthToTail(ListNode head, int k)// 取链表倒数第k个节点
	{
		if (null == head || 0 >= k)
		{
			return null;
		}
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		while (head != null)
		{
			list.add(head);
			head = head.next;
		}
		Collections.reverse(list);
		if (k > list.size())
		{
			return null;
		}
		return list.get(k - 1);
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null)
		{
			list.add(listNode.val);
			listNode = listNode.next;
		}
		Collections.reverse(list);
		return list;
	}

	public ListNode reverseList(ListNode head)//反转链表
	{
		if (null == head)
		{
			return null;
		}
		ListNode newHead = null;
		ListNode temp = null;

		while (null != head)
		{
			temp = head;
			head = head.next;
			temp.next = newHead;
			newHead = temp;
		}
		return newHead;
	}

	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		node1.next = node2;
		ListNode node3 = new ListNode(4);
		node2.next = node3;
		ListNode node4 = new ListNode(5);
		node3.next = node4;
		ListNode node5 = new ListNode(6);
		node4.next = node5;

		PrintListTailToHead p = new PrintListTailToHead();
		ArrayList<Integer> list = p.printListFromTailToHead(node1);
		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		ListNode listNode = p.findKthToTail(node1, 4);
		if (listNode != null)
		{
			System.out.println(listNode.val);
		}

		ListNode listNode1 = p.findKthToTail2(node1, 4);
		if (listNode1 != null)
		{
			System.out.println(listNode1.val);
		}
		
		ListNode listNode3 = p.reverseList(node1);
		if (listNode3 != null)
		{
			System.out.println(listNode3.val);
		}
	}
}

class ListNode
{
	int val;
	ListNode next = null;

	ListNode(int val)
	{
		this.val = val;
	}
}
