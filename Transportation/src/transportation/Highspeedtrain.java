package transportation;

/**
 * @author ���� 2018��10��22�� Highspeedtrain.java
 */
public class Highspeedtrain extends Transportation implements Access {
	public Highspeedtrain() {
		super("����", 3.0, 3.0, 0.1, 0.1, 0.02, 300, 0.45);
	}

	@Override
	public void print(double distance) {
		// TODO �Զ����ɵķ������
		this.compute(distance);
	}
}
