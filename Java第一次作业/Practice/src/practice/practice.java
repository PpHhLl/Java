package practice;

public class practice {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
