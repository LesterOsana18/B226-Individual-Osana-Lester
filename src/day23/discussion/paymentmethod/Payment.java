/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.paymentmethod;


public class Payment {
    
    public void pay(double amount) {
         System.out.println("Processing payment of P" + amount);
    }
    
    public void deposit(double amount, String refNum) {
        System.out.println("Deposit....");
    }
}
