package exceptionPractice;

public class ExceptionHandling {
	String name,surname;
	int id,year;
	
	public ExceptionHandling(String name, String surname, int id, int year){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.year = year;
	}
	public void display() {
		System.out.println(name+" "+surname+" "+id+" "+year);  
		try {
			  this.surname = null;
			  this.id = 22/0;
		  }catch (ArithmeticException e) {
			 System.out.println(e);
		  }
		//System.out.println(name+" "+surname+" "+id+" "+year);
		
	}
	public static void main(String[] args)
	{ 
		ExceptionHandling eh = new ExceptionHandling("Raju", "Karmakar" , 102, 2019);
		eh.display();
	}

}
