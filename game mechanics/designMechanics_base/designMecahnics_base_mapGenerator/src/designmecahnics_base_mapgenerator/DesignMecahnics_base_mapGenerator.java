/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designmecahnics_base_mapgenerator;

import java.util.Random;

/**
 *
 * @author bobjoe
 * 
 * 
 */
public class DesignMecahnics_base_mapGenerator {

    /**
     * @param args the command line arguments
     * 
     * -- Shieren the Wandered
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int max_sizeWidth = 30;
       int max_sizeHeight = 10;
        
       int max = 300;
       int min = 1;
       
       Random rand = new Random();
       int mapSize_value = rand.nextInt((max - min) + 1) - min;
    }
       
    private void mapGeneration_temp(int n){
        if(n > 0){
            System.out.print(n);
            mapGeneration_temp(n-1);
           }
       }
    
    
}
    

