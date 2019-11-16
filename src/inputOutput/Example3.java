package inputOutput;
// program to read single character
import java.io.*;

public class Example3 {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("F:\\Files\\Example.txt");
		int i = fis.read();
		System.out.print((char)i);
		fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
