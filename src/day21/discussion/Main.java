/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;


public class Main {
    
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("Pilot", "Black", 30, 0.5);
        ballpen.setBrand("Pilot");
        ballpen.setColor("Black");
        
        System.out.println(ballpen.getBrand());
        System.out.println(ballpen.getColor());
    }
}
