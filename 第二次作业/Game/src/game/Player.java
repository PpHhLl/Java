package game;

import java.util.Random;

public class Player {
	int num;//�յ�
	int score = 100;//��ҷ���
//�����յ�
	public Player() {
		Random rr = new Random();
		this.num = rr.nextInt(10);
	}
}
