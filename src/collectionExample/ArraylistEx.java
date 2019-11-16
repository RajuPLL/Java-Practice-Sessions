package collectionExample

import java.util.Iterator;
import java.util.LinkedList;

public class ArraylistEx {
	public void method3() {
		LinkedList<Character>al = new LinkedList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		
		Iterator<Character> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		ArraylistEx ab = new ArraylistEx();
		ab.method3();
	}

}
