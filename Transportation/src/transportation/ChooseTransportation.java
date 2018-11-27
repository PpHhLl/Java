package transportation;

import java.util.Scanner;

public class ChooseTransportation {
	Scanner in;
	String startPlace;//出发地
	String destination;//目的地
	double distance;//路程

	public void go() {
		in = new Scanner(System.in);
		System.out.println("请输入出发地：");
		startPlace = in.next();
		System.out.println("请输入目的地：");
		destination = in.next();
		System.out.println("请输入总路程：");
		distance = in.nextDouble();
		System.out.println("从" + "\t" + startPlace + "\t" + "到" + "\t" + destination + "\t");
		Car car = new Car();
		car.print(distance);
		Airplane airplane = new Airplane();
		airplane.print(distance);
		Highspeedtrain highspeedtrain = new Highspeedtrain();
		highspeedtrain.print(distance);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ChooseTransportation c = new ChooseTransportation();
		c.go();
	}

}
