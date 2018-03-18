package com.sunveee.algorithm.nowcoder;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * @author 51
 * @version $Id: 从尾到头打印链表.java, v 0.1 2018年3月20日 上午8:45:23 51 Exp $
 */
public class 从尾到头打印链表 {

    class ListNode {
        int      val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (null != listNode) {
            result.add(0, listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
}
