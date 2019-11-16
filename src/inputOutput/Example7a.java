package inputOutput;

import java.io.*;

public class Example7a {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1 = new FileInputStream("F:\\Files\\Example7a.txt");
		FileInputStream fin2 = new FileInputStream("F:\\Files\\Example7b.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}
		sis.close();
		fin1.close();
		fin2.close();
	}

}
