

public class Arithexception{

	public static void main(String[] args) {
		
		int a=10;
		int b =0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
			System.out.println("The arithmetic Exception coz number is divided by zero");
		}
		
		
	}

}
