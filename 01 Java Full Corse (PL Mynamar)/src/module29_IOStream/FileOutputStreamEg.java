package module29_IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEg {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("write.txt");
		out.write(65);
		out.write(69);
		out.close();
	}

}
