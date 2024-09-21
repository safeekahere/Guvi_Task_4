import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileExceptionTask {
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found exception Caught "+ e.getMessage());	
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception Caught "+ e.getMessage());	
			e.printStackTrace();
		}
	}

	
	
	public static void read() throws FileNotFoundException, InterruptedException
	{
		FileReader fr =new FileReader("Demo.txt");
	    Thread.sleep(2000);
	
	
	}
}
