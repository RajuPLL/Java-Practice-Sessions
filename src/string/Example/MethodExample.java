package string.Example;

public class MethodExample {
	String name = "Raju";
	String name2 = "raju";
	String surname = "Karmakar";
	String beh = "Raju karmakar is a good boy";

	public void method1() {
		// char ch = name.charAt(4); returns
		System.out.println("Character at index 3 is " + name.charAt(3));
	}

	public void method2() {
		// int behLength = beh.length();
		System.out.println("Length of the Stirng beh is " + beh.length());
	}

	public void method3() {
		System.out.println("Last char of the statement is " + beh.charAt(beh.length() - 1));
	}

	public void method4() {// accessing char at odd index
		for (int i = 0; i <= beh.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("char at " + i + "place is " + beh.charAt(i));
			}
		}

	}

	public void method5() {
		for (int i = 0; i < beh.length() - 1; i++) {
			if (i % 2 == 0) {
				System.out.println("char at " + i + "place is " + beh.charAt(i));
			}
		}
	}

	public void method6() {
		for (int i = 0; i < beh.length(); i++) {
			System.out.println("char at " + i + "place is " + beh.charAt(i));
		}
	}

	public void method7() {
		int count = 0;
		for (int i = 0; i <= beh.length() - 1; i++) {
			if (beh.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("frequency of a is " + count);
	}

	public void method8() {
		System.out.println(name.compareTo(surname));
		System.out.println(name.compareTo(name2));
	}// o/p is 7 as S1>S2 i.e 'R' is 7 times greater than 'K'
//	public void method9() {//concatenating
//		name.concat("Karmakar");	// String is immutable so cannot concatenate.
//		System.out.println(name);
//		name = name.concat(" "+surname);	// Concatenating explicitly
//		System.out.println(name);
//	}
//	public void method10() {//concatenating multiple Strings
//		name = name.concat(" "+surname).concat(" "+beh);	// Concatenating explicitly
//		System.out.println(name);
//	}

	public void method11() {
		System.out.println(beh.contains("is a good")); // right statement
		System.out.println(beh.contains("very")); // wrong statement
		System.out.println(beh.endsWith("boy")); // ends with
	}

	public void method12() {
		if (name.equals(surname)) {
			System.out.println("Name and surname are equal");
		} else
			System.out.println("Name and surname accepted");
	}

	public void method13() {
		char[] ch = new char[20];
		try {
			beh.getChars(5, 13, ch, 4);
			System.out.println(ch);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void method14() {
		System.out.println(name.indexOf('j'));// int indexOf(ch) expected ans = 2;
		System.out.println(name.indexOf("Raju")); // int indexOf(String str) expected ans = 0;
		System.out.println(beh.indexOf('k', 8)); // int indexOf(int ch,int fromIndex) expected ans = 10;
		System.out.println(beh.indexOf("is", 0)); // int indexOf(String str,int fromIndex) expected ans = 14;
	}
	public void method15() {
		String s1="Nayak";
		String s2= new String("Nayak");
		System.out.println(s1==s2);// expected false
		s2=s2.intern();
		System.out.println(s1==s2);
	}
	public void method16() {
		String s1= "";
		String s2= "Gundu";
		System.out.println("s1 is empty "+s1.isEmpty());
		System.out.println("s2 is empty "+s2.isEmpty());
	}
	public void method17() {
		String time = String.join(":", "12","10","15");
		System.out.println(time);
		String date = String.join("/", "23","10","2019");
		System.out.println(date);
	}
	public void method18() {
		String s1= "Narender is a good boy, he is reading java";
		s1 = s1.replaceAll("e", "a");
		System.out.println(s1);
	}
	public void method19() {
		String s1= "Vamshi is a good boy";
		String[] s2=s1.split("\\s");
		for(String s:s2) {
			System.out.println(s);
		}
	}
	public void method20() {
		String s1= "Vamshi is a good boyyy";
		for(String w:s1.split("y", 0)) {
			System.out.println(w);
		}
	}
	public void method21() {
		String s1 = "I have to make it";
		char[]s2 =s1.toCharArray();
		System.out.println("Length of the char array is "+s2.length);
		for(int i=0;i<s2.length;i++)
			System.out.println(s2[i]);
	}
	public void method22() {
		int num = 20;
		String s1 = "vamshi";
		String s2= String.valueOf(num);
		System.out.println(num+s1);
	}

	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		me.method1();
		me.method2();
		me.method3();
		// me.method4();
		// me.method5();
		// me.method6();
		me.method7();
		me.method8();
		// me.method9();
		// me.method10();
		me.method11();
		me.method12();
		me.method13();
		me.method14();
		me.method15();
		me.method16();
		me.method17();
		me.method18();
		me.method19();
		me.method20();
		me.method21();
		me.method22();
	}
}