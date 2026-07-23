/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26.discussion.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDicussion {

    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 58) + 1;

            lottoNumbers.add(randomNumber);
        }
        
        //System.out.println(lottoNumbers);
        
        // Traverse a hashset using for each loop
        for (int lotto : lottoNumbers) {
            System.out.println(lotto);
        }
        
        //lottoNumbers.forEach( (lottoNum) -> System.out.println(lottoNum));

    }
    
}
