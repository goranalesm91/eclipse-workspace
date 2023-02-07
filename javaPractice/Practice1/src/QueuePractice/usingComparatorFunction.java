package QueuePractice;
import java.util.*;


public class usingComparatorFunction {

	public static void main(String[] args) {
		PriorityQueue<Integer> number=new PriorityQueue<>();
			number.add(20);
			number.add(33);
			number.add(21);
			number.add(30);
			
			System.out.println(number);
			
			Iterator<Integer> iter=number.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}
			System.out.println();
			System.out.println("-------printing in revers order----");
			
			while(number.peek()!=null) {
				System.out.print(number.poll()+" ");
			}
	}
	
class CustomComparator implements Comparator<Integer> {

	 @Override
	    public int compare(Integer number1, Integer number2) {
	        int value =  number1.compareTo(number2);
	        // elements are sorted in reverse order
	        if (value > 0) {
	            return -1;
	        }
	        else if (value < 0) {
	            return 1;
	        }
	        else {
	            return 0;
	        }
	    }
	}
	}
