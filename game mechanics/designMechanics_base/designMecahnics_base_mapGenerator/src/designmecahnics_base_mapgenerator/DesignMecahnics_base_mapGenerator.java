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
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int max = 256;
       int min = 4;
       
       Random rand = new Random();
       int mapSize_value = rand.nextInt((max - min) + 1) - min;
       
       System.out.println(mapSize_value);
       }
    
}
