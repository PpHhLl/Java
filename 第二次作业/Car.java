import org.omg.CORBA.PRIVATE_MEMBER;
class Car {
	private String name;// ������
	private int tank;// ʣ������
	private int oilConsumption;// �ͺ�

	public Car() {
		this.name = "����";
		this.tank = 0;
		this.oilConsumption = 0;
	}

	public Car(String name, int tank, int oilConsumption) {
		this.name = name;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}

	// ��ȡ������
	public String getName() {
		return name;
	}

	// ��ȡ����ʣ������
	public int getTank() {
		return tank;
	}

	// ��ȡ�����ͺ�
	public int getoilConsumption() {
		return oilConsumption;
	}

	// �ж������Ƿ���Ҫ����
	public void gas() {
		if (tank == 0) {
			System.out.println("You should fill up the gas tank.");
		} else {
			System.out.println("The fuel tank is full.");
		}
	}

	// �ж������Ƿ��ܿ�
	public void run() {
		if (tank > 0) {
			System.out.println("The car can run.");
		} else {
			System.out.println("The car can not run.");
		}
	}
}



import java.awt.List;
import java.awt.print.Printable;
import java.util.Scanner;
import java.util.Vector;

import javax.print.DocFlavor.INPUT_STREAM;

public class CarTestDrive {
	Vector<Car> cars = new Vector<Car>();

	public static void main(String[] args) {
		CarTestDrive dd=new CarTestDrive();
		dd.print();
		Car cc=new Car();
		System.out.println(cc.getName());
		System.out.println(cc.getTank());
		System.out.println(cc.getoilConsumption());
		cc.gas();
		cc.run();
	}

	//��ȡ������������������Ժ������Դ�ӡ����
	private void print() {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("�������" + (i + 1) + "�������ģ���������ʣ���������Լ��ͺģ�");
			String name = in.next();
			int tank = in.nextInt();
			int oilConsumption = in.nextInt();
			Car car = new Car(name, tank, oilConsumption);
			cars.add(car);
		}
		for (int j = 0; j < cars.size(); j++) {
			System.out.println("��" + (j + 1) + "��������Ϊ" + cars.get(j).getName());
			System.out.println("��" + (j + 1) + "������ʣ������Ϊ" + cars.get(j).getTank());
			System.out.println("��" + (j + 1) + "�������ͺ�Ϊ" + cars.get(j).getoilConsumption());
			cars.get(j).gas();
			cars.get(j).run();
		}

	}

}

