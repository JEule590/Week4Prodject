import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String[] cars = new String[3];  //Array
		cars[0] = "cammaro";
		cars[1] = "F150";
		cars[2] = "mustang";
		
	//cannot just say String "what ever car you like"
		
	//	List<t> list of t where t is the generic that will be replaced with the type
	//	List<string>  reads as 'list of string
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football"); //do not need to define a number because this is dynamic
		sports.remove(1);
		
		for (int i = 0; i< sports.size(); i++) {  //for loop
			System.out.println(sports.get(i));
		}
		
		for(String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
	}

}
