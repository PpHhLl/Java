package company;

import java.util.Scanner;

/**
 * @author ����
 * 2018��10��15��
 * Manager.java
 */
public class Manager extends Workers{
	private int bonus;//������
	//���ø���Ĺ��캯�������û�������Ϣ��ʼ��������
	public Manager()
	{
		super();
		Scanner in=new Scanner(System.in);
		System.out.print("�����ʣ�");
		salary=in.nextDouble();
		bonus=(int)(Math.random()*10000);
		System.out.println("������"+bonus);
	}
	public int getBonus()
{
		return bonus;
}
	public void giveGift()
	{
		System.out.println("������"+super.getName()+"�����������");
	}
}
