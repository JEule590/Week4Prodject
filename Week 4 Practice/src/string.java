
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Video 1 String builder
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
	//	System.out.println(firstName.concat(lastName));
	   
	//	firstName.concat(lastName);
		firstName = firstName.concat(lastName); //example 1 append
		  System.out.println(firstName);
		  
		  StringBuilder fullName = new StringBuilder("Sam");
		  fullName.append(" Smith");
		  System.out.println(fullName.toString());
		  
		  System.out.println(fullName.charAt(5));  //example 3 CharAt - m
//		  System.out.println(fullName.deleteCharAt(5));
//		  System.out.println(fullName.delete(1,3));
		  System.out.println(fullName.indexOf("it"));  // example 4 indexOf
		  System.out.println(fullName.replace(4, 9, "Thompson")); //Replace
		  System.out.println(fullName.reverse());  //reverse
	}
    public static String multiplyString(String str, int num) {
    	StringBuilder result = new StringBuilder();  // example 2 append
    	for (int i = 0; i< num; i++) {
    		result.append(str);
    	}
    	return result.toString();
    }
}
