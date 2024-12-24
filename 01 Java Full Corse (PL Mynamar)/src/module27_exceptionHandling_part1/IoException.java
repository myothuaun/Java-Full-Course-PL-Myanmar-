package module27_exceptionHandling_part1;

import java.io.IOException;

public class IoException {
	static char charInput() throws IOException {
		return (char) System.in.read();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Character is "+ charInput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
