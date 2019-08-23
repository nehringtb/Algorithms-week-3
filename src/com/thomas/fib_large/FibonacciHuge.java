package com.thomas.fib_large;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
       ArrayList<Integer> sequence = calcSequence(n,m);
       System.out.println(sequence.toString());
        return sequence.get((int)(n%sequence.size()));
    }
    
    private static ArrayList<Integer> calcSequence(long n,long m){
  	  ArrayList<Integer> sequence=new ArrayList<Integer>();
  	  int fib=0;
  	  int fibOne=1;
  	  int fibTwo=1;
  	 
  	  sequence.add(0);
  	  sequence.add(1);

  	 if (m<2)
  	 	return sequence;
  	  
  	  while (!(sequence.get(sequence.size()-1)==1 && sequence.get(sequence.size()-2)==0 ) || sequence.size()<3){
  		  fib=fibOne+fibTwo;
  		  fibTwo=fibOne;
  		  fibOne=fib;
  		  sequence.add((int)(fib%m));
  		  //System.out.println(sequence.size());
  	  }
  	  	sequence.remove(sequence.size()-1);
  	  	sequence.remove(sequence.size()-1);
  	  //System.out.println(sequence.toString());
  	  return sequence;
  	  
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        //calcSequence( 10,3);
        //System.out.println("calculating...");
        System.out.println(getFibonacciHuge(n, m));
        scanner.close();
    }
}

