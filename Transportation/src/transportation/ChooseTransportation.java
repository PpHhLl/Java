package transportation;

import java.util.Scanner;

public class ChooseTransportation {
	Scanner in;
	String startPlace;//������
	String destination;//Ŀ�ĵ�
	double distance;//·��

	public void go() {
		in = new Scanner(System.in);
		System.out.println("����������أ�");
		startPlace = in.next();
		System.out.println("������Ŀ�ĵأ�");
		destination = in.next();
		System.out.println("��������·�̣�");
		distance = in.nextDouble();
		System.out.println("��" + "\t" + startPlace + "\t" + "��" + "\t" + destination + "\t");
		Car car = new Car();
		car.print(distance);
		Airplane airplane = new Airplane();
		airplane.print(distance);
		Highspeedtrain highspeedtrain = new Highspeedtrain();
		highspeedtrain.print(distance);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ChooseTransportation c = new ChooseTransportation();
		c.go();
	}

}
