package com.thomas.fibonacci;
import java.util.Scanner;

public class Fib {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }
  
  private static long calc_fib_fast(int n){
	  long[] values= new long[n+1];
	  if (n <= 1){
	  return n;
	  }
	  values[0]=1;
	  values[1]=1;
	  
	  for (int i=2;i<n+1;i++){
		  values[i]=values[i-1]+values[i-2];
	  }
	  
	  return values[n-1];
	  
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
   // int n = in.nextInt();

    //System.out.println(calc_fib(n));
    //System.out.println(calc_fib_fast(n));
    in.close();
	  fullTest();
  }
  
  private static void fullTest(){
	  for (int n=0; n<46; n++){
		 // System.out.println("n="+n);
		//System.out.println(calc_fib(n));
	  	System.out.println(calc_fib_fast(n)%5);
	  	
	  }
  }
}
