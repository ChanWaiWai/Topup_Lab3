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
public class EmptyListException extends RuntimeException{
    public EmptyListException () {
        super("List is empty");
    }
}
