/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.overriding;


public class Husband extends Person{
    
    @Override
    public void role(){
        System.out.println("I am a Husband. I give my "
                + "wife all of my attention.");
    }
}
