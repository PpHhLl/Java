package company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author 彭华莉
 * 2018年10月17日
 * CompanyTestDrive.java
 */
public class CompanyTestDrive {
	static CompanyTestDrive company=new CompanyTestDrive();
	ArrayList<Manager> managers=new ArrayList<Manager>();
	ArrayList<Employee> employees=new ArrayList<Employee>();
	ArrayList<Stockholder> stockholders=new ArrayList<Stockholder>();
	Random random = new Random();
	int profit = random.nextInt(900000)+100000;//公司利润为900000至1000000的随机数 
	static String filePath ="D:\\Company.txt";//文件路径
	//生成文件
			public static boolean createFile(String filePath){
			boolean result = false;
			File file = new File(filePath);
			if(!file.exists()){
				try {
					result = file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			return result;
			}
			//写入文件
			public static void writeFile(String filePath, String content) throws IOException{
				File file = new File(filePath);
				synchronized (file) {
					FileWriter fw = new FileWriter(filePath,true);
					fw.write(content);
					fw.close();
				}
			}
	
	public void workersInformation()
	{
	
	
	createFile(filePath); 
	Scanner in=new Scanner(System.in);
	boolean judge=true;//通过judge控制是否继续输入信息
	
	while (judge){
		System.out.println("请输入经理信息：");
	Manager manager=new Manager();
	managers.add(manager);
	System.out.print("是否继续输入经理信息？：（Y or N）");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	judge = true;
	
	while (judge){
		System.out.println("请输入员工信息：");
	Employee employee=new Employee();
	employees.add(employee);
	System.out.print("是否继续输入员工信息？：（Y or N）");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	
	judge=true;
	
	while (judge){
		System.out.println("请输入股东信息：");
	Stockholder stockholder=new Stockholder();
	stockholders.add(stockholder);
	System.out.print("是否继续输入股东信息？：（Y or N）");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	}
	//查询信息
	public void searchInformation() throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("请选择要查询的信息"+"\n"+"1：查询所有人的信息"+"\t"+"2：查询某一个worker的信息");
		int number=in.nextInt();

		File filename = new File(filePath); // 要读取以上路径的input.txt文件
		 // 建立一个对象，它把文件内容转成计算机能读懂的语言
		//查询所有员工信息
				if(number==1){
					InputStreamReader reader = new InputStreamReader(
							new FileInputStream(filename)); // 建立一个输入流对象reader
					BufferedReader br = new BufferedReader(reader);
					String line;
					do {
							line= br.readLine();//一次读取文件中的一行内容
							if(line!=null)
								System.out.println(line);
				}while(line!=null);

			}
		//查询某一个worker的信息
		while(number==2)
		{
			InputStreamReader reader = new InputStreamReader(
					new FileInputStream(filename)); // 建立一个输入流对象reader
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			System.out.print("请输入worker姓名：");
			in.nextLine();
			String name=in.nextLine();
			//将文件中每一行worker信息中的姓名与要查找的姓名进行匹配，匹配成功则将对应员工那一行员工信息进行输出
			while (line != null) {
				String na = line.split(" ")[1];// 将文件中读取的一行信息按空格进行拆分，得到worker的名字
				//
				if(na.equals(name))
				{
					System.out.println(line);
				}
				line = br.readLine();//一次读取文件中的一行内容
			}
			System.out.print("是否继续查询(Y or N)：");
			String isContinue = in.nextLine();
			if(isContinue.equals("N")||isContinue.equals("n"))
				number=3;
		}

		
	}
	//发放工资、礼物和分红
	public void finance()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("请输入年和月份（xxxx.xx）：");
		String ym=in.nextLine();
		String m=ym.split("\\.")[1];//将输入的字符串用.进行分割，得到月份，从而判断是否发放生日礼物和股东分红
		for(Employee employee:employees)
		{
			String birthday=employee.getBirthday();
			String bir=birthday.split("\\.")[1];
			employee.getSalary();
			if(m.equals(bir))
			{
				employee.giveGift();
			}
			String content=(ym+" "+employee.getName()+" "+employee.getBirthday()+" "+employee.getSalary()+"\n");
			try {
				writeFile(filePath, content);
				System.out.println("员工"+employee.getName()+"发放工资完成！金额为"+employee.getSalary()+"元");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		for(Manager manager:managers)
		{
			String birthday=manager.getBirthday();
			String bir=birthday.split("\\.")[1];
			manager.getSalary();
			
			if(m.equals(bir))
			{
				manager.giveGift();
			}
			String content=(ym+" "+manager.getName()+" "+manager.getBirthday()+" "+manager.getSalary()+" "+manager.getBonus()+"\n");
			try {
				company.writeFile(filePath, content);
				System.out.println("经理"+manager.getName()+"工资发放完成！金额为"+manager.getSalary()+"元");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(m.equals("12"))
		{
			for(Stockholder stockholder:stockholders)
			{
				stockholder.setSalary(profit);
				String content=(ym+" "+stockholder.getName()+" "+stockholder.getBirthday()+" "+stockholder.getSalary()+"\n");
				try {
					company.writeFile(filePath, content);
					System.out.println("股东"+stockholder.getName()+"分红完成！股东分红为"+(float)(stockholder.salary)+"元");
					
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}

		}
	}
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入worker的信息：");
			company.workersInformation();
		while(true)
		{
			System.out.println("请选择要进行的操作：1.查询信息"+"\t"+"2.发放工资、礼物和分红");
			int choice=in.nextInt();
			if(choice==1){
				company.searchInformation();
		}
			else{
				company.finance();
			}
			
		}
		
}
}


