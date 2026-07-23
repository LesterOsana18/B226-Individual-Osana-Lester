/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion.linkedlist;

import java.util.LinkedList;
import java.util.List;


public class LinkedListDiscussion {
    
    public static void main(String[] args) {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        
        evenNumbers.addFirst(2);
        evenNumbers.addLast(10);
        
        System.out.println(evenNumbers);
        
        evenNumbers.removeFirst();
        evenNumbers.removeLast();
        
        System.out.println(evenNumbers);
        
        System.out.println(evenNumbers.getFirst());
        System.out.println(evenNumbers.getLast());
    }
}

/*
    ArrayList = dynamic array (random access/ get)
    LinkedList = node based (insertion/deletion)
*/
