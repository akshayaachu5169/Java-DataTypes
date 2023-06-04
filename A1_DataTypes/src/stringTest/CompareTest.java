package stringTest;

public class CompareTest {
public static void main(String[] args) {
	String a= "vcentry";
	String b = "vcentry";
	String c = "Vcentry";
	String d = "99Vcentry";
	System.out.println(a.compareTo(b));
	System.out.println(a.compareTo(c));//default value
	System.out.println(a.compareTo(d));
	System.out.println(c.compareTo(a));//returns negative
	
}
}
