package genericliborutility;

public class SampleMain {
	
	public int xml = 7;
	private static String privateString = "This is a private String";
	public static String publicString = "This is public String";

	public static void main(String[] args) {
		
		System.out.println("Inside main()");
		
		int i = 7;
		int j = 10;

		//System.out.println("Addtion: " + addition(6, 3));
		//System.out.println("Subtraction: " + subtraction(6, 3));
		
		//System.out.println("Subtraction: " + "subtraction(6, 3)");
		//System.out.println("Subtraction: " + subtraction(6, 3));
		
		//System.out.println("" + str + " addition: " + addition(i, j));
		System.out.println("addition: " + addition(2,5));
		System.out.println("Puppy String: " + stringConcatnation("Panchakhshari", "Mounika"));
		System.out.println("Puppy String: " + stringConcatnationWithReturnType("Panchakhshari", "Mounika"));
	}
	
	private static int addition (int a, int b) {
		int x = a + b;
		
		return x;
	}
	
	private static int subtraction(int abc, int xyz) {
		int x = abc - xyz;
		return x;
	}
	
	private static String stringConcatnation(String abc, String xyz) {
		String outString = abc + " " + xyz;
		System.out.println("output: " + outString);
		return outString;
	}
	
	private static void stringConcatnationWithReturnType(String abc, String xyz) {
		String outString = abc + " " + xyz;
		System.out.println("output: " + outString);
		//return outString;
	}

}
