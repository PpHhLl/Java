package company;

import java.util.Scanner;

/**
 * @author ����
 * 2018��10��17��
 * People.java
 */
public abstract class Workers {
	private String name;//worker����
	private String birthday;//worker����
	protected double salary;//�����Ա���Ĺ��ʣ��ɶ��ֺ�
	//���캯����ͨ���û��������Ϣ����ʼ��Ա���������ɶ����е���������������
	public Workers()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("������");
		name=in.next();
		System.out.print("����(year.month.day)��");
		birthday=in.next();
	}
	public void setName(String na)
	{
		name=na;
	}
	public String getName()
	{
		return name;
	}
	public void setBirthday(String b)
	{
		birthday=b;
	}
	public String getBirthday()
	{
		return birthday;
	}
	public void setSalary(double s)
	{
		salary=s;
	}
	public double getSalary()
	{
		return salary;
	}
}
