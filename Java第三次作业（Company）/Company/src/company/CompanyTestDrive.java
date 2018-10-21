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
 * @author ����
 * 2018��10��17��
 * CompanyTestDrive.java
 */
public class CompanyTestDrive {
	static CompanyTestDrive company=new CompanyTestDrive();
	ArrayList<Manager> managers=new ArrayList<Manager>();
	ArrayList<Employee> employees=new ArrayList<Employee>();
	ArrayList<Stockholder> stockholders=new ArrayList<Stockholder>();
	Random random = new Random();
	int profit = random.nextInt(900000)+100000;//��˾����Ϊ900000��1000000������� 
	static String filePath ="D:\\Company.txt";//�ļ�·��
	//�����ļ�
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
			//д���ļ�
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
	boolean judge=true;//ͨ��judge�����Ƿ����������Ϣ
	
	while (judge){
		System.out.println("�����뾭����Ϣ��");
	Manager manager=new Manager();
	managers.add(manager);
	System.out.print("�Ƿ�������뾭����Ϣ������Y or N��");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	judge = true;
	
	while (judge){
		System.out.println("������Ա����Ϣ��");
	Employee employee=new Employee();
	employees.add(employee);
	System.out.print("�Ƿ��������Ա����Ϣ������Y or N��");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	
	judge=true;
	
	while (judge){
		System.out.println("������ɶ���Ϣ��");
	Stockholder stockholder=new Stockholder();
	stockholders.add(stockholder);
	System.out.print("�Ƿ��������ɶ���Ϣ������Y or N��");
	String isContinue = in.nextLine();
	if (isContinue.equals("N")){
		judge = false;
	}
	}
	}
	//��ѯ��Ϣ
	public void searchInformation() throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("��ѡ��Ҫ��ѯ����Ϣ"+"\n"+"1����ѯ�����˵���Ϣ"+"\t"+"2����ѯĳһ��worker����Ϣ");
		int number=in.nextInt();

		File filename = new File(filePath); // Ҫ��ȡ����·����input.txt�ļ�
		 // ����һ�����������ļ�����ת�ɼ�����ܶ���������
		//��ѯ����Ա����Ϣ
				if(number==1){
					InputStreamReader reader = new InputStreamReader(
							new FileInputStream(filename)); // ����һ������������reader
					BufferedReader br = new BufferedReader(reader);
					String line;
					do {
							line= br.readLine();//һ�ζ�ȡ�ļ��е�һ������
							if(line!=null)
								System.out.println(line);
				}while(line!=null);

			}
		//��ѯĳһ��worker����Ϣ
		while(number==2)
		{
			InputStreamReader reader = new InputStreamReader(
					new FileInputStream(filename)); // ����һ������������reader
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			System.out.print("������worker������");
			in.nextLine();
			String name=in.nextLine();
			//���ļ���ÿһ��worker��Ϣ�е�������Ҫ���ҵ���������ƥ�䣬ƥ��ɹ��򽫶�ӦԱ����һ��Ա����Ϣ�������
			while (line != null) {
				String na = line.split(" ")[1];// ���ļ��ж�ȡ��һ����Ϣ���ո���в�֣��õ�worker������
				//
				if(na.equals(name))
				{
					System.out.println(line);
				}
				line = br.readLine();//һ�ζ�ȡ�ļ��е�һ������
			}
			System.out.print("�Ƿ������ѯ(Y or N)��");
			String isContinue = in.nextLine();
			if(isContinue.equals("N")||isContinue.equals("n"))
				number=3;
		}

		
	}
	//���Ź��ʡ�����ͷֺ�
	public void finance()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("����������·ݣ�xxxx.xx����");
		String ym=in.nextLine();
		String m=ym.split("\\.")[1];//��������ַ�����.���зָ�õ��·ݣ��Ӷ��ж��Ƿ񷢷���������͹ɶ��ֺ�
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
				System.out.println("Ա��"+employee.getName()+"���Ź�����ɣ����Ϊ"+employee.getSalary()+"Ԫ");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
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
				System.out.println("����"+manager.getName()+"���ʷ�����ɣ����Ϊ"+manager.getSalary()+"Ԫ");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
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
					System.out.println("�ɶ�"+stockholder.getName()+"�ֺ���ɣ��ɶ��ֺ�Ϊ"+(float)(stockholder.salary)+"Ԫ");
					
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}

		}
	}
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		Scanner in=new Scanner(System.in);
		System.out.println("������worker����Ϣ��");
			company.workersInformation();
		while(true)
		{
			System.out.println("��ѡ��Ҫ���еĲ�����1.��ѯ��Ϣ"+"\t"+"2.���Ź��ʡ�����ͷֺ�");
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


