package transportation;

public class Airplane extends Transportation implements Access {

	public Airplane() {
		super("�ɻ�", 1.0, 1.0, 0.15, 0.15, 0.01, 800.0, 0.75);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void print(double distance) {
		// TODO �Զ����ɵķ������
		this.compute(distance);
	}

}
