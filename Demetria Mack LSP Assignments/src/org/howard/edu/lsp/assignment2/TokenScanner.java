package org.howard.edu.lsp.assignment2;
import java.util.Scanner;

public class TokenScanner {
	  
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("String?");
        String[] tokens = scanner.nextLine().split(" ");
        if(tokens[0].equals("Goodbye")){
            break;
          }
        System.out.println("Tokens:");
        for(String elements: tokens ){
            System.out.println(elements);
          }  
        int sum = 0;
        int product = 1;
        for(String i : tokens ){
          sum = sum + Integer.parseInt(i);
          product = product * Integer.parseInt(i);
        }
        System.out.println("Sum:" + sum);
        System.out.println("Product:" + product);
        }
    }
}
