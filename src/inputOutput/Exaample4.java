package inputOutput;
import java.io.*;
public class Exaample4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("F:\\Files\\Example.txt");
		int i=0;
		while((i=fin.read())!= -1) {
			System.out.print((char)i);
		}fin.close();
		
	}

}
