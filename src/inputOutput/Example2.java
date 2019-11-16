package inputOutput;

import java.io.*;

public class Example2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("F:\\Files\\Example1.txt");
		String s1 = "Welcome to program 2";
		byte b[] = s1.getBytes();
		//fout.write(b);
		fout.write(b, 2,s1.length()-2);
		fout.write(65); // byte value but not integer
		fout.close();

	}

}
