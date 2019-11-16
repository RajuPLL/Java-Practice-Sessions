package inputOutput;

import java.io.*;

public class Example6 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("F:\\Files\\Example2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		bis.close();
		fis.close();

	}

}
