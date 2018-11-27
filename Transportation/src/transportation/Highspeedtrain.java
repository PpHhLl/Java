package transportation;

/**
 * @author 彭华莉 2018年10月22日 Highspeedtrain.java
 */
public class Highspeedtrain extends Transportation implements Access {
	public Highspeedtrain() {
		super("高铁", 3.0, 3.0, 0.1, 0.1, 0.02, 300, 0.45);
	}

	@Override
	public void print(double distance) {
		// TODO 自动生成的方法存根
		this.compute(distance);
	}
}
