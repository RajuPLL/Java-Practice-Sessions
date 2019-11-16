package collectionExample;

import java.util.*;

public class CollectionClass1 {
	public void method1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		Iterator<Integer> i = list1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public void method2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vamshi");
		list.add("Raju");
		list.add("Narender");
		list.add("nayak");
		list.add(1, "Srujan");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

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
	public void method4() {
		Vector<String> v = new Vector<String>();
		v.add("Raju");
		v.add("Biryani");
		
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}
	public static void main(String[] args) {
		CollectionClass1 cc = new CollectionClass1();
		//cc.method1();
		//cc.method2();
		cc.method3();
		//cc.method4();
	}

}
