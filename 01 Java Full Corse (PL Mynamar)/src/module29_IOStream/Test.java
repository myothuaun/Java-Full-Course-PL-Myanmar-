package module29_IOStream;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter number = ");
		int b = System.in.read();
		System.out.write(b);
		System.out.write('\n');
	}

}
