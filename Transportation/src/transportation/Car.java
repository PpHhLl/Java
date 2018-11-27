package transportation;

/**
 * @author 彭华莉 2018年10月22日 Car.java
 */
public class Car extends Transportation implements Access {
	public Car() {
		super("汽车", 10.0, 10.0, 0.05, 0.05, 0.03, 30.0, 0.32);
	}

	@Override
	public void print(double distance) {
		// TODO 自动生成的方法存根
		this.compute(distance);
	}
}
