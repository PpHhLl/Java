package company;

import java.util.Scanner;
import java.util.Set;

/**
 * @author 彭华莉
 * 2018年10月15日
 * Stockholder.java
 */
public class Stockholder extends Workers{
private int stock;//股东股份
//调用父类的构造函数后继续让用户输入信息初始化股东的股份
public Stockholder ()
{
	super();
	Scanner in=new Scanner(System.in);
	System.out.print("股东股份所占百分比：");
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
