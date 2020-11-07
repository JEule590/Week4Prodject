import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		/"
//		 " List
//		 "  
//		 " allows duplicates
//		 "keeps elements ordered yb index
//		  allows null arrays
//		  Common implementations are ArrayList, LinkedList, Vector
//		 /
		
		 List<String> students = new ArrayList<String>();
		 students.add("Rob");
		 students.add("Rob");
		 students.add("Sam");
		 students.add(null);
		 
		 
		 for(String student : students) {
			 System.out.println(student);
		 }
		 
		 System.out.println(students.get(2)); //Sam
		 System.out.println(students.get(0)); //Rob
		 
		//Set
//		set unlike a list does not allow duplicates
//		 unordered
//		 Allows null value
//		 Common Implementation HashSet, LinkedHashSet, TreeSet
		 
		 Set<String> states = new HashSet<String>();
		 states.add("Alabama");
		 states.add("Alaska");
		 states.add("Arizona");
		 states.add("Arkansas");
		 states.add("California");
		 states.add(null);
		 
		 System.out.println(states.size());
		 System.out.println(states.contains("Alabama"));
				 
		 for (String state : states) {
		 System.out.println(state);
		 }
		 
		//Map
//		 Map(k, v) K is the key and vis the value
//		Key value pairs (dictionary)
//		Values can be duplicate, but not keys
//		 Common Implications HashMap, LinkedHashMap, TreeMap, Hashtable
//		 
//		 
//		 
		 
		 Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		 racerPlacements.put(1, "Tommy");
		 racerPlacements.put(2, "Sally");
		 racerPlacements.put(3, "John");
		 
		 System.out.println(racerPlacements.get(1));
		 
		 Set<Integer> racerKeys = racerPlacements.keySet();
		 for (Integer key : racerKeys) {
			 System.out.println(key + " : " + racerPlacements.get(1) ); 	 
		 }
		
		 Collection<String> racers = racerPlacements.values();
		 for(String racer : racers) {
			 System.out.println(racer);
		 }
		 
		 
		 Map<String, String> dictionary = new HashMap<String, String>();
		 dictionary.put("Augment", " to make greater, more numerous, larger, or more intense");
		 dictionary.put("diminish", "to make less or cause to appear less");	
		 dictionary.put("Ostintatious",	"attracting or seeking to attract attention, admiration, or envy often by gaudiness or obviousness");
		  
	}

}
