package stringTest;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="Akshaya";
String b="mummy";
System.out.println("actual a value:" + a);
System.out.println("after replacement: " + a.replace("sha", "ra"));
String parent = b.replace("mummy", "daddy");
System.out.println(parent);
System.out.println("a value replaced with b: " + a.replaceAll(a, b));
	}

}
