package company;

import java.util.Scanner;

/**
 * @author 彭华莉 2018年10月17日 People.java
 */
public abstract class Workers {
	private String name;// worker名字
	private String birthday;// worker生日
	protected double salary;// 经理和员工的工资，股东分红
	// 构造函数：通过用户输入的信息来初始化员工、经理、股东都有的姓名和生日属性

	public Workers() {
		Scanner in = new Scanner(System.in);
		System.out.print("姓名：");
		name = in.next();
		System.out.print("生日(year.month.day)：");
		birthday = in.next();
	}

	public void setName(String na) {
		name = na;
	}

	public String getName() {
		return name;
	}

	public void setBirthday(String b) {
		birthday = b;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setSalary(double s) {
		salary = s;
	}

	public double getSalary() {
		return salary;
	}
}
