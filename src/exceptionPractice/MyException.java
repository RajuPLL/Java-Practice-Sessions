package exceptionPractice;

public class MyException extends Exception {
	public static int accNo[] = { 1001, 1002, 1003, 1004, 1005 };
	public static String name[] = { "Raju", "Vamshi", "Nari", "Nags", "Srujan" };
	public static double bal[] = { 500, 1000, 9999, 1001, 9999.99 };

//	MyException()
//	{
//		System.out.println("Balance is less than 1000");
//	}

	MyException(String s) {
		super(s);
	}

	public static void main(String[] args) {
		try 
		{
			System.out.println("AccNo"+ " \t "+ "Cust"+ " \t "+"Bal");
			for(int i=0; i<5;i++) 
			{
				System.out.println(accNo[i]+"\t"+name[i]+"\t"+bal[i]);
				if(bal[i]<1000)
				{
					MyException me = new MyException("Balance is less than 1000");
					throw me;
				}
				
			}
		}catch (MyException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}

	}

}
