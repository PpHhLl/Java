package game;

import java.util.Random;

public class Player {
	int num;//谜底
	int score = 100;//玩家分数
//生成谜底
	public Player() {
		Random rr = new Random();
		this.num = rr.nextInt(10);
	}
}
