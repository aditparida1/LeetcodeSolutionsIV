/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class InsertintoSortedCircularLinkedList708
{
    public Node insert(Node head, int insertVal) 
    {
        if(head == null)
        {
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }
        Node[] result = findSmallestandLargest(head);
        
        Node smallest = result[0];
        Node largest = result[1];
        Node newNode = new Node(insertVal);
        
        if(insertVal <= smallest.val)
        {
            newNode.next = smallest;
            largest.next = newNode;
            return head;
        }
        else if(insertVal >= largest.val)
        {
            newNode.next = largest.next;
            largest.next = newNode;
            return head;
        }
        else
        {
            Node curr = smallest;
            do
            {
                if(insertVal >= curr.val && insertVal <= curr.next.val)
                {
                    newNode.next = curr.next;
                    curr.next = newNode;
                    break;
                }
                curr = curr.next;
            }while(curr != smallest);
        }
        
        return head;
    }
    private Node[] findSmallestandLargest(Node head)
    {
        Node[] result = new Node[2];
        Node curr = head;
        result[0] = curr;
        result[1] = curr;
        do
        {
            if(curr.val < result[0].val)
            {
                result[0] = curr;
            }
            if(curr.val >= result[1].val)
            {
                result[1] = curr;
            }
            curr = curr.next;
        }while(curr != head);
        return result;
    }
}
