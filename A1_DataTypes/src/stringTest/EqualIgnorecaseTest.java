package stringTest;

public class EqualIgnorecaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "vcentry";
		String b ="vcentry";
		String c ="Vcentry";//capital letter is ignored
		String d ="Hello";
	
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(b.equalsIgnoreCase(d));
	}

}
