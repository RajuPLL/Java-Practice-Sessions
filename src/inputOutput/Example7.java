
//example to read two files and write one file
package inputOutput;

import java.io.*;

public class Example7 {

	public static void main(String[] args) throws IOException {
		InputStream fin1 = new FileInputStream("F:\\Files\\Example7a.txt") ;
		InputStream fin2 = new FileInputStream("F:\\Files\\Example7b.txt") ;
		FileOutputStream fout = new FileOutputStream("F:\\Files\\Example7c.txt") ;
		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
		int i;
//		while((i=fin1.read())!=-1) {
//			System.out.print((char)i);
//		}
//		System.out.println(" ");
//		while((i=fin2.read())!=-1) {
//			System.out.print((char)i);
//		}
//		System.out.println(" ");
//		int j;
		while((i=sis.read())!=-1) {
			//System.out.println((char)j);
			fout.write((char)i);
		}
		sis.close();
		fout.close();
		fin2.close();
		fin1.close();
		//System.out.println("success");

	}

}
