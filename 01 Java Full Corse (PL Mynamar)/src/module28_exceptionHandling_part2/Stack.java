package module28_exceptionHandling_part2;

public class Stack {
	private int content[] = new int [10];
	private int index = 0;
	
	private boolean full() {
		try {
		if(index>9) throw new StackFullException(index);
		}catch(StackFullException e) {
			System.out.println(e);
		}
		return (index>9)?true:false;
	}
	
	private boolean empty() {
		try {
		if(index == 0) throw new StackEmptyException();
		}catch(StackEmptyException e) {
			System.out.println(e);
		}
		return (index == 0)?true:false;	
	}
	
	boolean push(int i) {
		if(!full())
		{
		content[index ++] = i; //post increment operator
		return true;
		}
		else
			return false;
		}
	int pop() {
		if(!empty())
		return content[--index]; //pre
		else 
		return -1;
	}
	
}
