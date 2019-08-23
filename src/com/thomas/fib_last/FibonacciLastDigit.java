package com.thomas.fib_last;
import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
    	int[] values= new int[n+1];
  	  if (n <= 1){
  	  return n;
  	  }
  	  values[0]=1;
  	  values[1]=1;
  	  
  	  for (int i=2;i<n+1;i++){
  		  values[i]=(values[i-1]+values[i-2]) % 10;
  	  }
  	  
  	  return values[n-1];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
        scanner.close();
    }
    
}

