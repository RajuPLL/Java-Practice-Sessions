package string.Example;

public class StirngBuilderExamples {

//	public void StringAdd() {
//		StringBuilder sb1 = new StringBuilder();
//		sb1.append("Raju");
////		sb1.append('a');
////		sb1.append("is a good boy");
//		System.out.println("My name is "+ sb1.toString() );
//	}
//	
////	public void display() {
////		System.out.println("My name is "+ );
////	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Vamshi");
		//sb.append(100);
		//sb.append('K');
		sb.append(" Krishna and I am good boy");
		//sb.append("is a good boy");
		//sb.append(25.25);
		//sb.append(28.28f);
		System.out.println("My name is "+ sb.toString() );
		System.out.println("capacity of the empty constructor is "+ sb.capacity());
		System.out.println(sb.codePointAt(7)); // returns code value of char at specified index.
		sb.deleteCharAt(1);
		System.out.println("after deleting char at index 1 "+ sb.toString());

	}

}
