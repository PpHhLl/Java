package company;

import java.util.Scanner;
import java.util.Set;

/**
 * @author ����
 * 2018��10��15��
 * Stockholder.java
 */
public class Stockholder extends Workers{
private int stock;//�ɶ��ɷ�
//���ø���Ĺ��캯����������û�������Ϣ��ʼ���ɶ��Ĺɷ�
public Stockholder ()
{
	super();
	Scanner in=new Scanner(System.in);
	System.out.print("�ɶ��ɷ���ռ�ٷֱȣ�");
	stock=in.nextInt();
	
	} 
public void setStock(int st)
{
	stock=st;
}

public float getStock()
{
	return stock;
}

public void setSalary(int profit)
{
	salary=(stock*0.01*profit*0.1);
}
}
