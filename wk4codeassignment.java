import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wk4codeassignment {

	public static void main(String[] args) {
		
//(1)Create an instance of an ArrayList of String called employeeNames		
		List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Bob");
			employeeNames.add("Tina");
			employeeNames.add("Gene");
			employeeNames.add("Linda");
			employeeNames.add("Louise");
			
//(2)Create an instance of a HashSet of Integer called ids			
		Set<Integer> ids = new HashSet<Integer>();
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ids.add(4);
			ids.add(5);
			
//(3 & 4) Create an instance of a HashMap of Integer, String called employeeMap, add 5 entries to set and list			
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
//(5) Create variable i, iterate over ids using enhanced for loop. Use employeeMap.put() to add new map entries. Key should be ids, value should be employeeName at position i, and the i iterates.		
		for( int id : ids ) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
	System.out.println(employeeMap); //Test of enh. for loop above to populate map	

//(6) Once map is populated, use another enh. for loop to iterate over the the employeeMap.keySet() and use the key for each current iteration to print both the current key and its associated map value
		for ( int id : employeeMap.keySet() ) {
			System.out.println(id + ": " + employeeMap.get(id));
		}
//(7) Create a StringBuilder called idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		
//(8) Iterate over the ids HashSet and append each id, followed by a dash to idsbuilder 
		for ( int id : ids) {
			idsBuilder.append(id + " - ");
		}
//(9) Print the result of idsBuilder.toString() to the console
		System.out.println(idsBuilder.toString());
		
//(10) Create another StringBuilder called namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
		
//(11) Iterate over the employeeNames ArrayList and append each name, followed by a space to the namesBuilder
		for ( String name : employeeNames) {
			namesBuilder.append(name + " ");
		}

//(12) Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());
	}

}
