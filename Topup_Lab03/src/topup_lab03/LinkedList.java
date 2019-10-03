/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topup_lab03;

/**
 *
 * @author wchan
 */
public class LinkedList {
    private ListNode head;
    private ListNode tail;
    public LinkedList(){
        head = tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToHead(Object item){
    
    }
    
    public void addToTail(Object item){
    
    }
    
    public Object removeFromHead() throws EmptyListException {
        return "";
    }
    
    public Object removeFromTail() throws EmptyListException {
        return "";
    }
    
    public String toString(){
        String s = "[ ";
        ListNode current = head;
        while(current != null) {
            s += current.data + " ";
            current = current.next;
        }
        return s + "]";
    }
}
