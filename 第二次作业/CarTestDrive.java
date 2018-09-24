import org.omg.CORBA.PRIVATE_MEMBER;
class Car {
	private String name;// 汽车名
	private int tank;// 剩余油量
	private int oilConsumption;// 油耗

	public Car() {
		this.name = "奔驰";
		this.tank = 0;
		this.oilConsumption = 0;
	}

	public Car(String name, int tank, int oilConsumption) {
		this.name = name;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}

	// 获取汽车名
	public String getName() {
		return name;
	}

	// 获取汽车剩余油量
	public int getTank() {
		return tank;
	}

	// 获取汽车油耗
	public int getoilConsumption() {
		return oilConsumption;
	}

	// 判断汽车是否需要加油
	public void gas() {
		if (tank == 0) {
			System.out.println("You should fill up the gas tank.");
		} else {
			System.out.println("The fuel tank is full.");
		}
	}

	// 判断汽车是否能开
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

	//获取输入的三辆汽车的属性后将其属性打印出来
	private void print() {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) + "辆汽车的：汽车名、剩余油量、以及油耗：");
			String name = in.next();
			int tank = in.nextInt();
			int oilConsumption = in.nextInt();
			Car car = new Car(name, tank, oilConsumption);
			cars.add(car);
		}
		for (int j = 0; j < cars.size(); j++) {
			System.out.println("第" + (j + 1) + "辆汽车名为" + cars.get(j).getName());
			System.out.println("第" + (j + 1) + "辆汽车剩余油量为" + cars.get(j).getTank());
			System.out.println("第" + (j + 1) + "辆汽车油耗为" + cars.get(j).getoilConsumption());
			cars.get(j).gas();
			cars.get(j).run();
		}

	}

}

