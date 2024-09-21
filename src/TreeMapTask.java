import java.util.*;
 
class Person implements Comparable<Person> {
    private int id;
    private String name;
 
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    // Implement the compareTo() method of the Comparable interface
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }
}
 
public class TreeMapTask {
    public static void main(String[] args) {
        // Create a TreeMap object using the Person class that implements Comparable interface
        TreeMap<Person, String> treeMap = new TreeMap<>();
 
        // Add some key-value pairs to the TreeMap
        treeMap.put(new Person(102, "Safeeka"), "value1");
        treeMap.put(new Person(103, "Andrew"), "value2");
        treeMap.put(new Person(80, "Zaydan"), "value20");
        treeMap.put(new Person(100, "Hamdan"), "value3");
        treeMap.put(new Person(99,"Aidan"), "value4");
        treeMap.put(new Person(90, "Hameeda"), "value5");
 
        // Iterate over the TreeMap and print the key-value pairs
        for (Map.Entry<Person, String> entry : treeMap.entrySet()) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.getId() + " " + key.getName() + " " + value);
        }
    }
}