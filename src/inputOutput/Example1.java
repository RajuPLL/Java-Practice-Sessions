package inputOutput;
import java.io.*;
public class Example1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("F:\\Files\\Example.txt");
		String s = "Welcome to first input output file text";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
	}

}
