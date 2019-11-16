package inputOutput;

import java.io.*;

public class Example5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("F:\\Files\\Example2.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Hi I am BufferedOutputStream";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();

	}
}
