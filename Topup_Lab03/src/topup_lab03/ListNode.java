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
public class ListNode {
    Object data;
    ListNode next;
    ListNode(Object o){
        data = o;
        next = null;
    }
    
    ListNode(Object o, ListNode nextNode){
        data = o;
        next = nextNode;
    }
    
    Object getData(){
        return data;
    }
    
    ListNode getNext(){
        return next;
    }
}
