package stringTest;

public class IndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0123456789
String a ="vcentry technologies";
System.out.println(a.indexOf("n"));
System.out.println(a.indexOf("nol"));
System.out.println(a.indexOf("tec"));
System.out.println(a.indexOf('z'));//-1
System.out.println(a.indexOf("v",-1));
System.out.println(a.indexOf("g",17));
	}

}
