package com.sonthaya;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	Scanner input = new Scanner (System.in);
    	
    	animal animal1 = new animal();
    	
    	System.out.println("Give me your name please : ");
    	
    	String name = input.nextLine();
    	
    	animal1.giveName(name);
    	  	
 
    }
    
}

