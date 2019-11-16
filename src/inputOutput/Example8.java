package inputOutput;
import java.io.*;
import java.util.*;
public class Example8 {

	public static void main(String[] args)throws IOException{
		FileInputStream fin1 = new FileInputStream("F:\\Files\\Exmple7a.txt");
		FileInputStream fin2 = new FileInputStream("F:\\Files\\Exmple7b.txt");
		FileInputStream fin3 = new FileInputStream("F:\\Files\\Exmple1.txt");
		FileInputStream fin4 = new FileInputStream("F:\\Files\\Exmple2.txt");
		
		Vector v = new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		
		Enumeration e = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1) {
			System.out.println((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fin3.close();
		fin4.close();

	}

}
