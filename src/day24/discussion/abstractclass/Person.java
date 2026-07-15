/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion.abstractclass;


// Abstract Class
public abstract class Person {
    
    // non-abstract method / concrete method
    public final void walk() {
        System.out.println("Walking...");
    }
    
    // non-access modifier: abstract method
    public abstract void role();
    
}
