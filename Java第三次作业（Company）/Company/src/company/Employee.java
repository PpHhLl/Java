package company;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author ����
 * 2018��10��15��
 * Employee.java
 */
public class Employee extends Workers{
//���ø���Ĺ��캯����ʼ�����������պ�������û�������Ϣ��ʼ��Ա������
public Employee()
{
	super();
	Scanner in=new Scanner(System.in);
	System.out.print("Ա�����ʣ�");
	salary=in.nextDouble();
}

public void giveGift()
{
	System.out.println("��Ա��"+super.getName()+"�����������");
}
}
