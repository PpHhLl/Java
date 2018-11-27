package transportation;

public class Airplane extends Transportation implements Access {

	public Airplane() {
		super("飞机", 1.0, 1.0, 0.15, 0.15, 0.01, 800.0, 0.75);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void print(double distance) {
		// TODO 自动生成的方法存根
		this.compute(distance);
	}

}
