public class Array_String_Exception {
    public static void main(String[] args) {
        // Example of ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e.getMessage());
        }

        // Example of StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            System.out.println("Accessing character at index 10: " + str.charAt(10)); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Caught: " + e.getMessage());
        }
    }
}
