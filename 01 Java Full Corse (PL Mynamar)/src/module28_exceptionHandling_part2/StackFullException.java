package module28_exceptionHandling_part2;

public class StackFullException extends Exception{
int size;

	public StackFullException(int size) {
	this.size = size;
}

	@Override
	public String toString() {
		return "Stack is Full!, Maximum size is " + size;
	}

}
