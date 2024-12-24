package module26_encapsulation;

public class Stack {
	private int content[] = new int [10];
	private int index = 0;
	
	private boolean full() {
		return (index>9)?true:false;
	}
	private boolean empty() {
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
