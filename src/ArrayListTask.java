import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("Srilanka");
		al.add("Bhutan");
		al.add("Nepal");
		al.add("Maldives");
		
		//print ArrayList
		System.out.println("Print the data of my list "+al);
		
		//remove in arraylist
		System.out.println("Removed item from the list is "+al.remove(1));
		
		//to clear the Arraylist/ delete
		al.clear();
		System.out.println("The ArrayList after removing/clearing " +al);
		System.out.println(al.isEmpty());
		

	}

}
