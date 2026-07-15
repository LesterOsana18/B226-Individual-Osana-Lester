/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

// Model 
public class Ballpen {
    
    // this -> refers to the current class object
    // data hiding -> making all the data members private 
    // data validation -> data use setter and getter methods 
    
    // private fields / members
    private int id;
    private String brand; // pilot
    private String color; // black
    private double price;
    private double pointSize;
    
//    // default constructor
//    public Ballpen(){
//        
//    }
    
    // parameterized constructor / setter constructor
    public Ballpen(String brand, String color, double price, double pointSize){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.pointSize = pointSize;
    }
    
    
    
    
    // setter method / mutator method
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    // getter method / accessor method
    public String getBrand(){
        return brand;
    }
    
    public String getColor(){
        return color;
    }
}
