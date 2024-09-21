



import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
      System.out.println(message);
   }
}

public class Custome_Exception {
	 
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your age: ");
       
       try {
           int age = scanner.nextInt();
           AgeValidation(age);
           System.out.println("Your age is: " + age);
       } catch (Exception e) {
           System.out.println("InvalidAgeException caught: " + e.getMessage());
       } 
   }

   // Method to validate age
   public static void AgeValidation(int age) throws InvalidAgeException {
       if (age < 18) {
           throw new InvalidAgeException("Age must be at least 18.");
       }
       else {
       	System.out.println("You are Eligible");
       }
   }
}
