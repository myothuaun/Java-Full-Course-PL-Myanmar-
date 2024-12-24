package module28_exceptionHandling_part2;

public class StackObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Stack s = new Stack();
		while(s.push(number)) {
			System.out.println("Number pushed is " + number);
			number ++;
		}
		System.out.println();
		
		boolean thereAreItems = true;
		while(thereAreItems) {
			number = s.pop();
			if(number != -1)
				
			System.out.println("Number poped is "+ number);
			else
				thereAreItems = false;
			}

	}

}
