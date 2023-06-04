package stringTest;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="vcentry";
        // 0123456

System.out.println(a.substring(1));
System.out.println("print y:" + a.substring(6));
System.out.println("blank:" + a.substring(7));//blank
System.out.println(a.substring(1, 4));
System.out.println("print v:" + a.substring(0, 1));
System.out.println(a.substring(0, 7));
System.out.println("last 3:" + a.substring(4, 7));
	}

}
