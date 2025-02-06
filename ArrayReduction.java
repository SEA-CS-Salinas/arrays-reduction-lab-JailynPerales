//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jailyn Perales

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ArrayReduction
{
	public static int min_cost( int[] r )
	{
		//MUST USE A PRIORITY QUEUE
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		//Putting array into queue
		for(int i = 0; i < r.length; i ++){
		   queue.add(r[i]);
		   
		}
		int min = 0;
		if(queue.size() < 2){
		    return 0;
		}
		while(queue.size() > 1){
		    int one = queue.poll();
		    int two = queue.poll();
		    int newVar = one + two;
		    min += newVar;
		    queue.add(newVar);
		}
		return min;
	}
	
	
	
	
	public static void main( String[] args )
	{
		int[] s0 = {212};
		System.out.println( ArrayReduction.min_cost(s0));
		
		int[] s1 = {25,10,20};
		System.out.println( ArrayReduction.min_cost(s1));		
			
		int[] s2 = {1,2,3};
		System.out.println( ArrayReduction.min_cost(s2));	
			
		int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
	    System.out.println( ArrayReduction.min_cost(s3));	
			
		int[] s4 = {1,1,1,1,1};
		System.out.println( ArrayReduction.min_cost(s4));	
			
		int[] s5 = {1,1};
		System.out.println( ArrayReduction.min_cost(s5));												
	}
}

/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/

