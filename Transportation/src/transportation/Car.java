package transportation;

/**
 * @author ���� 2018��10��22�� Car.java
 */
public class Car extends Transportation implements Access {
	public Car() {
		super("����", 10.0, 10.0, 0.05, 0.05, 0.03, 30.0, 0.32);
	}

	@Override
	public void print(double distance) {
		// TODO �Զ����ɵķ������
		this.compute(distance);
	}
}
