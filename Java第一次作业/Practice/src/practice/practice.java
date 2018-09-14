package practice;

public class practice {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
String c="Hello world!";
String a;
a=c;
System.out.println(System.identityHashCode(a));
System.out.println(System.identityHashCode(c));
a="String";
System.out.println(c);
System.out.println(System.identityHashCode(a));
System.out.println(System.identityHashCode(c));
	}

}
