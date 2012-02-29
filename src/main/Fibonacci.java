package main;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	private List<Long> sequence;
	
	public Fibonacci() {
		this.sequence = new ArrayList<Long>();
	}
	
	private long next() {
		long next = 0;
		if(sequence.isEmpty()) {
			next = 1;
		}
		else if(sequence.size() == 1) {
			next = 2;
		}
		else {
			next = sequence.get(sequence.size()-1) + sequence.get(sequence.size()-2);
		}
		
		sequence.add(next);
		
		return next;
	}
	
	public long sumEvenNumbersUntil(long limit) {
		long sum = 0, current = 0;
		int count = 1; //1,1,2,3,5,8,13,21,34: Always the third position number is even
		while(current <= limit) {
			if(++count == 3) { //(then I avoid using the mod function everytime)
				current = next();
				sum += current;
				count = 0;
			}
			else current = next();
				
		}
		return sum;
	}
	
}
