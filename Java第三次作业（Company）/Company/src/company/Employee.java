package company;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author 彭华莉
 * 2018年10月15日
 * Employee.java
 */
public class Employee extends Workers{
//调用父类的构造函数初始化姓名和生日后继续让用户输入信息初始化员工工资
public Employee()
{
	super();
	Scanner in=new Scanner(System.in);
	System.out.print("员工工资：");
	salary=in.nextDouble();
}

public void giveGift()
{
	System.out.println("给员工"+super.getName()+"发放生日礼物！");
}
}
