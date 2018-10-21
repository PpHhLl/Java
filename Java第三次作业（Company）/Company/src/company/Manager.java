package company;

import java.util.Scanner;

/**
 * @author 彭华莉
 * 2018年10月15日
 * Manager.java
 */
public class Manager extends Workers{
	private int bonus;//经理奖金
	//调用父类的构造函数后让用户输入信息初始化经理奖金
	public Manager()
	{
		super();
		Scanner in=new Scanner(System.in);
		System.out.print("经理工资：");
		salary=in.nextDouble();
		bonus=(int)(Math.random()*10000);
		System.out.println("经理奖金："+bonus);
	}
	public int getBonus()
{
		return bonus;
}
	public void giveGift()
	{
		System.out.println("给经理"+super.getName()+"发放生日礼物！");
	}
}
