package module29_IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEg {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("write.txt");
		int i;
		do {
			i = in.read();
			if(i!=-1) {
			System.out.write(i);
			System.out.write('\n'); //=>enter
//			System.out.println(i);
			}
			}while(i != -1);
		in.close();
	}

}
