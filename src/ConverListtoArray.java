import java.util.ArrayList;
import java.util.List;

public class ConverListtoArray {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> stringList = new ArrayList<>();
        stringList.add("Bengaluru");
        stringList.add("Chennai");
        stringList.add("Hyderabad");
        stringList.add("Delhi");
        stringList.add("Mumbai");

        // Print the original List
        System.out.println("Original List: " + stringList);

        // Convert List to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the Array
        System.out.println("Converted Array:");
        for (String City : stringArray) {
        System.out.println(City);
        }
    }
}
