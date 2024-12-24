package module27_exceptionHandling_part1;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[4];
		try {
		System.out.println("Test Exception");
		num[5] = 10;
		System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Arrays Index out of Bound error");
		}
	}

}
