package task2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Arrayshuffle {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };
		System.out.println("Elements of original array: ");    
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");
        } 
	    shuffleArray(array) ;
	    {
	    	System.out.println("\n after shuffle");
	    for (int i1 = 0; i1 < array.length; i1++) {
	    
	      System.out.print(array[i1] + " ");
	    }
	    System.out.println();{
	    
	    }
        }
	  }

	 
	  static void shuffleArray(int[] ar)
	  {
	    
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
}