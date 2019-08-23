package com.thomas.lcm;
import java.util.*;

public class LCM {
  private static long lcm(long a, long b) {
    //write your code here
    return a * b/euclidGcd(a,b);
  }
  
  private static long euclidGcd(long a, long b) {
	  if (b==0)
		  return a;
	 
    long ap= a%b;

    return euclidGcd(b,ap);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
    scanner.close();
  }
}
