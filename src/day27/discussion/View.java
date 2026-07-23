/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27.discussion;

import java.util.ArrayList;
import java.util.List;



public class View {

    public void displayAllStudents() {
        Repository repo = new Repository();
        
        List<Student> studentList = repo.getAllStudents();
        
        // Iterate and display
        for (Student stud : studentList) {
            System.out.println(stud);
        }
    } 
    
    
}
